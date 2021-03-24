grammar FunctionBuilderParser;

// Parser Rules
start: modulus EOF;

modulus: addition | modulus op=(MODULUS | PERCENT) modulus;
addition: multiplication | addition op=(PLUS | MINUS) addition;
multiplication: multiplicationWithoutOp | multiplication op=(MULTIPLY | DIVIDE) multiplication;
multiplicationWithoutOp
    : signedPower #PowerOnly
    | signedPower multiplicationWithoutOp #WithoutOp
    ;
signedPower: <assoc=right> sign=(PLUS | MINUS) signedPower | power;
power: signedFunction | <assoc=right> power op=HAT power | <assoc=right> variable numeric;
signedFunction: function | <assoc=right> sign=(PLUS | MINUS) signedFunction;
function: signedAtom | prefixFunctionName function | function postfixFunctionName;
signedAtom: scalarProduct | <assoc=right> sign=(PLUS | MINUS) signedAtom;
scalarProduct: atom | number? constant variable | variable constant;
atom: number | variable | LPAREN addition RPAREN;
number: numeric | constant;
numeric: NUMERICS;
constant: CONSTANTS;
variable: VARIABLE;

prefixFunctionName
    :   logarithmicFunctionName
    |   exponentialFunctionName
    |   irrationalFunctionName
    |   gammaFunctionName
    |   trigonometricFunctionName prefixFunctionPower?
    |   hyperbolicFunctionName prefixFunctionPower?
    ;

prefixFunctionPower
    :   HAT p=number
    |   HAT LMPAREN p=number RMPAREN
    ;

postfixFunctionName
    :   factorialFunctionName
    ;

logarithmicFunctionName: 'log' | 'ln';
exponentialFunctionName: 'exp';
irrationalFunctionName: 'sqrt' | '√';
gammaFunctionName: 'gamma' | 'Γ';
trigonometricFunctionName: TRIGONOMETRIC_FUNCTIONS;
hyperbolicFunctionName: HYPERBOLIC_FUNCTIONS;
factorialFunctionName:  '!';

// Lexer Rules
NUMERICS: [0-9]+ ('.' [0-9]+)? ('E' ('+'|'-')? [0-9]+)?;
CONSTANTS: PI | EULER;
VARIABLE: 'x';
LPAREN: '(';
RPAREN: ')';
LMPAREN: '{';
RMPAREN: '}';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*' | '×';
DIVIDE: '/' | '÷';
MODULUS: 'mod';
PERCENT: '%';
HAT: '^';

TRIGONOMETRIC_FUNCTIONS
    :   ARC? SIN | SIN INVERSE
    |   ARC? COS | COS INVERSE
    |   ARC? TAN | TAN INVERSE
    |   ARC? CSC | CSC INVERSE
    |   ARC? SEC | SEC INVERSE
    |   ARC? COT | SEC INVERSE
    ;
HYPERBOLIC_FUNCTIONS
    :   ARC? SIN HYPERBOLIC | SIN HYPERBOLIC INVERSE
    |   ARC? COS HYPERBOLIC | COS HYPERBOLIC INVERSE
    |   ARC? TAN HYPERBOLIC | TAN HYPERBOLIC INVERSE
    |   ARC? CSC HYPERBOLIC | CSC HYPERBOLIC INVERSE
    |   ARC? SEC HYPERBOLIC | SEC HYPERBOLIC INVERSE
    |   ARC? COT HYPERBOLIC | SEC HYPERBOLIC INVERSE
    ;

fragment PI: 'PI' | 'pi' | 'π';
fragment EULER: 'e';
fragment ARC: 'arc' | 'a';
fragment SIN: 'sin';
fragment COS: 'cos';
fragment TAN: 'tan';
fragment CSC: 'csc' | 'cosec';
fragment SEC: 'sec';
fragment COT: 'cot';
fragment HYPERBOLIC: 'h';
fragment INVERSE: '^-1' | '^(-1)';


WS: [ \r\n\t]+ -> skip;