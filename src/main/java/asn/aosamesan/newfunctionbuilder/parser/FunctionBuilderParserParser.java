// Generated from /Users/aosamesan/IdeaProjects/new-function-builder/src/main/java/asn/aosamesan/newfunctionbuilder/parser/FunctionBuilderParser.g4 by ANTLR 4.9.1
package asn.aosamesan.newfunctionbuilder.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FunctionBuilderParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMERICS=9, 
		CONSTANTS=10, VARIABLE=11, LPAREN=12, RPAREN=13, LMPAREN=14, RMPAREN=15, 
		PLUS=16, MINUS=17, MULTIPLY=18, DIVIDE=19, MODULUS=20, PERCENT=21, HAT=22, 
		TRIGONOMETRIC_FUNCTIONS=23, HYPERBOLIC_FUNCTIONS=24, WS=25;
	public static final int
		RULE_start = 0, RULE_modulus = 1, RULE_addition = 2, RULE_multiplication = 3, 
		RULE_multiplicationWithoutOp = 4, RULE_signedPower = 5, RULE_power = 6, 
		RULE_signedFunction = 7, RULE_function = 8, RULE_signedAtom = 9, RULE_scalarProduct = 10, 
		RULE_atom = 11, RULE_number = 12, RULE_numeric = 13, RULE_constant = 14, 
		RULE_variable = 15, RULE_prefixFunctionName = 16, RULE_prefixFunctionPower = 17, 
		RULE_postfixFunctionName = 18, RULE_logarithmicFunctionName = 19, RULE_exponentialFunctionName = 20, 
		RULE_irrationalFunctionName = 21, RULE_gammaFunctionName = 22, RULE_trigonometricFunctionName = 23, 
		RULE_hyperbolicFunctionName = 24, RULE_factorialFunctionName = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "modulus", "addition", "multiplication", "multiplicationWithoutOp", 
			"signedPower", "power", "signedFunction", "function", "signedAtom", "scalarProduct", 
			"atom", "number", "numeric", "constant", "variable", "prefixFunctionName", 
			"prefixFunctionPower", "postfixFunctionName", "logarithmicFunctionName", 
			"exponentialFunctionName", "irrationalFunctionName", "gammaFunctionName", 
			"trigonometricFunctionName", "hyperbolicFunctionName", "factorialFunctionName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'log'", "'ln'", "'exp'", "'sqrt'", "'\u221A'", "'gamma'", "'\u0393'", 
			"'!'", null, null, "'x'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", null, 
			null, "'mod'", "'%'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NUMERICS", "CONSTANTS", 
			"VARIABLE", "LPAREN", "RPAREN", "LMPAREN", "RMPAREN", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "MODULUS", "PERCENT", "HAT", "TRIGONOMETRIC_FUNCTIONS", 
			"HYPERBOLIC_FUNCTIONS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionBuilderParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionBuilderParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ModulusContext modulus() {
			return getRuleContext(ModulusContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FunctionBuilderParserParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			modulus(0);
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModulusContext extends ParserRuleContext {
		public Token op;
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public List<ModulusContext> modulus() {
			return getRuleContexts(ModulusContext.class);
		}
		public ModulusContext modulus(int i) {
			return getRuleContext(ModulusContext.class,i);
		}
		public TerminalNode MODULUS() { return getToken(FunctionBuilderParserParser.MODULUS, 0); }
		public TerminalNode PERCENT() { return getToken(FunctionBuilderParserParser.PERCENT, 0); }
		public ModulusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitModulus(this);
		}
	}

	public final ModulusContext modulus() throws RecognitionException {
		return modulus(0);
	}

	private ModulusContext modulus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ModulusContext _localctx = new ModulusContext(_ctx, _parentState);
		ModulusContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_modulus, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			addition(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ModulusContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_modulus);
					setState(58);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(59);
					((ModulusContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MODULUS || _la==PERCENT) ) {
						((ModulusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(60);
					modulus(2);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditionContext extends ParserRuleContext {
		public Token op;
		public MultiplicationContext multiplication() {
			return getRuleContext(MultiplicationContext.class,0);
		}
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(FunctionBuilderParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionBuilderParserParser.MINUS, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		return addition(0);
	}

	private AdditionContext addition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditionContext _localctx = new AdditionContext(_ctx, _parentState);
		AdditionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_addition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			multiplication(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_addition);
					setState(69);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(70);
					((AdditionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(71);
					addition(2);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicationContext extends ParserRuleContext {
		public Token op;
		public MultiplicationWithoutOpContext multiplicationWithoutOp() {
			return getRuleContext(MultiplicationWithoutOpContext.class,0);
		}
		public List<MultiplicationContext> multiplication() {
			return getRuleContexts(MultiplicationContext.class);
		}
		public MultiplicationContext multiplication(int i) {
			return getRuleContext(MultiplicationContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(FunctionBuilderParserParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(FunctionBuilderParserParser.DIVIDE, 0); }
		public MultiplicationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitMultiplication(this);
		}
	}

	public final MultiplicationContext multiplication() throws RecognitionException {
		return multiplication(0);
	}

	private MultiplicationContext multiplication(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationContext _localctx = new MultiplicationContext(_ctx, _parentState);
		MultiplicationContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_multiplication, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(78);
			multiplicationWithoutOp();
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplication);
					setState(80);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(81);
					((MultiplicationContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						((MultiplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(82);
					multiplication(2);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicationWithoutOpContext extends ParserRuleContext {
		public MultiplicationWithoutOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationWithoutOp; }
	 
		public MultiplicationWithoutOpContext() { }
		public void copyFrom(MultiplicationWithoutOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerOnlyContext extends MultiplicationWithoutOpContext {
		public SignedPowerContext signedPower() {
			return getRuleContext(SignedPowerContext.class,0);
		}
		public PowerOnlyContext(MultiplicationWithoutOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterPowerOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitPowerOnly(this);
		}
	}
	public static class WithoutOpContext extends MultiplicationWithoutOpContext {
		public SignedPowerContext signedPower() {
			return getRuleContext(SignedPowerContext.class,0);
		}
		public MultiplicationWithoutOpContext multiplicationWithoutOp() {
			return getRuleContext(MultiplicationWithoutOpContext.class,0);
		}
		public WithoutOpContext(MultiplicationWithoutOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterWithoutOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitWithoutOp(this);
		}
	}

	public final MultiplicationWithoutOpContext multiplicationWithoutOp() throws RecognitionException {
		MultiplicationWithoutOpContext _localctx = new MultiplicationWithoutOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_multiplicationWithoutOp);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new PowerOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				signedPower();
				}
				break;
			case 2:
				_localctx = new WithoutOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				signedPower();
				setState(90);
				multiplicationWithoutOp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedPowerContext extends ParserRuleContext {
		public Token sign;
		public SignedPowerContext signedPower() {
			return getRuleContext(SignedPowerContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionBuilderParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionBuilderParserParser.MINUS, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public SignedPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterSignedPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitSignedPower(this);
		}
	}

	public final SignedPowerContext signedPower() throws RecognitionException {
		SignedPowerContext _localctx = new SignedPowerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signedPower);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				((SignedPowerContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((SignedPowerContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				signedPower();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				power(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public Token op;
		public SignedFunctionContext signedFunction() {
			return getRuleContext(SignedFunctionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public TerminalNode HAT() { return getToken(FunctionBuilderParserParser.HAT, 0); }
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		return power(0);
	}

	private PowerContext power(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PowerContext _localctx = new PowerContext(_ctx, _parentState);
		PowerContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_power, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(100);
				signedFunction();
				}
				break;
			case 2:
				{
				setState(101);
				variable();
				setState(102);
				numeric();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PowerContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_power);
					setState(106);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(107);
					((PowerContext)_localctx).op = match(HAT);
					setState(108);
					power(2);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SignedFunctionContext extends ParserRuleContext {
		public Token sign;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public SignedFunctionContext signedFunction() {
			return getRuleContext(SignedFunctionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionBuilderParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionBuilderParserParser.MINUS, 0); }
		public SignedFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterSignedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitSignedFunction(this);
		}
	}

	public final SignedFunctionContext signedFunction() throws RecognitionException {
		SignedFunctionContext _localctx = new SignedFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedFunction);
		int _la;
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				function(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((SignedFunctionContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((SignedFunctionContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				signedFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public PrefixFunctionNameContext prefixFunctionName() {
			return getRuleContext(PrefixFunctionNameContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public PostfixFunctionNameContext postfixFunctionName() {
			return getRuleContext(PostfixFunctionNameContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		return function(0);
	}

	private FunctionContext function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionContext _localctx = new FunctionContext(_ctx, _parentState);
		FunctionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICS:
			case CONSTANTS:
			case VARIABLE:
			case LPAREN:
			case PLUS:
			case MINUS:
				{
				setState(120);
				signedAtom();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case TRIGONOMETRIC_FUNCTIONS:
			case HYPERBOLIC_FUNCTIONS:
				{
				setState(121);
				prefixFunctionName();
				setState(122);
				function(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(126);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(127);
					postfixFunctionName();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SignedAtomContext extends ParserRuleContext {
		public Token sign;
		public ScalarProductContext scalarProduct() {
			return getRuleContext(ScalarProductContext.class,0);
		}
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionBuilderParserParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionBuilderParserParser.MINUS, 0); }
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitSignedAtom(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signedAtom);
		int _la;
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICS:
			case CONSTANTS:
			case VARIABLE:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				scalarProduct();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((SignedAtomContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((SignedAtomContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				signedAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScalarProductContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ScalarProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterScalarProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitScalarProduct(this);
		}
	}

	public final ScalarProductContext scalarProduct() throws RecognitionException {
		ScalarProductContext _localctx = new ScalarProductContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_scalarProduct);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(139);
					number();
					}
					break;
				}
				setState(142);
				constant();
				setState(143);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				variable();
				setState(146);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(FunctionBuilderParserParser.LPAREN, 0); }
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FunctionBuilderParserParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICS:
			case CONSTANTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				number();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(LPAREN);
				setState(153);
				addition(0);
				setState(154);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICS:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				numeric();
				}
				break;
			case CONSTANTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericContext extends ParserRuleContext {
		public TerminalNode NUMERICS() { return getToken(FunctionBuilderParserParser.NUMERICS, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitNumeric(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numeric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NUMERICS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode CONSTANTS() { return getToken(FunctionBuilderParserParser.CONSTANTS, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CONSTANTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(FunctionBuilderParserParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixFunctionNameContext extends ParserRuleContext {
		public LogarithmicFunctionNameContext logarithmicFunctionName() {
			return getRuleContext(LogarithmicFunctionNameContext.class,0);
		}
		public ExponentialFunctionNameContext exponentialFunctionName() {
			return getRuleContext(ExponentialFunctionNameContext.class,0);
		}
		public IrrationalFunctionNameContext irrationalFunctionName() {
			return getRuleContext(IrrationalFunctionNameContext.class,0);
		}
		public GammaFunctionNameContext gammaFunctionName() {
			return getRuleContext(GammaFunctionNameContext.class,0);
		}
		public TrigonometricFunctionNameContext trigonometricFunctionName() {
			return getRuleContext(TrigonometricFunctionNameContext.class,0);
		}
		public PrefixFunctionPowerContext prefixFunctionPower() {
			return getRuleContext(PrefixFunctionPowerContext.class,0);
		}
		public HyperbolicFunctionNameContext hyperbolicFunctionName() {
			return getRuleContext(HyperbolicFunctionNameContext.class,0);
		}
		public PrefixFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterPrefixFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitPrefixFunctionName(this);
		}
	}

	public final PrefixFunctionNameContext prefixFunctionName() throws RecognitionException {
		PrefixFunctionNameContext _localctx = new PrefixFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_prefixFunctionName);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				logarithmicFunctionName();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				exponentialFunctionName();
				}
				break;
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				irrationalFunctionName();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				gammaFunctionName();
				}
				break;
			case TRIGONOMETRIC_FUNCTIONS:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				trigonometricFunctionName();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAT) {
					{
					setState(173);
					prefixFunctionPower();
					}
				}

				}
				break;
			case HYPERBOLIC_FUNCTIONS:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				hyperbolicFunctionName();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAT) {
					{
					setState(177);
					prefixFunctionPower();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixFunctionPowerContext extends ParserRuleContext {
		public NumberContext p;
		public TerminalNode HAT() { return getToken(FunctionBuilderParserParser.HAT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LMPAREN() { return getToken(FunctionBuilderParserParser.LMPAREN, 0); }
		public TerminalNode RMPAREN() { return getToken(FunctionBuilderParserParser.RMPAREN, 0); }
		public PrefixFunctionPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixFunctionPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterPrefixFunctionPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitPrefixFunctionPower(this);
		}
	}

	public final PrefixFunctionPowerContext prefixFunctionPower() throws RecognitionException {
		PrefixFunctionPowerContext _localctx = new PrefixFunctionPowerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prefixFunctionPower);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(HAT);
				setState(183);
				((PrefixFunctionPowerContext)_localctx).p = number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(HAT);
				setState(185);
				match(LMPAREN);
				setState(186);
				((PrefixFunctionPowerContext)_localctx).p = number();
				setState(187);
				match(RMPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixFunctionNameContext extends ParserRuleContext {
		public FactorialFunctionNameContext factorialFunctionName() {
			return getRuleContext(FactorialFunctionNameContext.class,0);
		}
		public PostfixFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterPostfixFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitPostfixFunctionName(this);
		}
	}

	public final PostfixFunctionNameContext postfixFunctionName() throws RecognitionException {
		PostfixFunctionNameContext _localctx = new PostfixFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_postfixFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			factorialFunctionName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogarithmicFunctionNameContext extends ParserRuleContext {
		public LogarithmicFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logarithmicFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterLogarithmicFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitLogarithmicFunctionName(this);
		}
	}

	public final LogarithmicFunctionNameContext logarithmicFunctionName() throws RecognitionException {
		LogarithmicFunctionNameContext _localctx = new LogarithmicFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logarithmicFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExponentialFunctionNameContext extends ParserRuleContext {
		public ExponentialFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentialFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterExponentialFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitExponentialFunctionName(this);
		}
	}

	public final ExponentialFunctionNameContext exponentialFunctionName() throws RecognitionException {
		ExponentialFunctionNameContext _localctx = new ExponentialFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exponentialFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IrrationalFunctionNameContext extends ParserRuleContext {
		public IrrationalFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_irrationalFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterIrrationalFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitIrrationalFunctionName(this);
		}
	}

	public final IrrationalFunctionNameContext irrationalFunctionName() throws RecognitionException {
		IrrationalFunctionNameContext _localctx = new IrrationalFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_irrationalFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GammaFunctionNameContext extends ParserRuleContext {
		public GammaFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gammaFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterGammaFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitGammaFunctionName(this);
		}
	}

	public final GammaFunctionNameContext gammaFunctionName() throws RecognitionException {
		GammaFunctionNameContext _localctx = new GammaFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gammaFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrigonometricFunctionNameContext extends ParserRuleContext {
		public TerminalNode TRIGONOMETRIC_FUNCTIONS() { return getToken(FunctionBuilderParserParser.TRIGONOMETRIC_FUNCTIONS, 0); }
		public TrigonometricFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigonometricFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterTrigonometricFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitTrigonometricFunctionName(this);
		}
	}

	public final TrigonometricFunctionNameContext trigonometricFunctionName() throws RecognitionException {
		TrigonometricFunctionNameContext _localctx = new TrigonometricFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trigonometricFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TRIGONOMETRIC_FUNCTIONS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HyperbolicFunctionNameContext extends ParserRuleContext {
		public TerminalNode HYPERBOLIC_FUNCTIONS() { return getToken(FunctionBuilderParserParser.HYPERBOLIC_FUNCTIONS, 0); }
		public HyperbolicFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperbolicFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterHyperbolicFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitHyperbolicFunctionName(this);
		}
	}

	public final HyperbolicFunctionNameContext hyperbolicFunctionName() throws RecognitionException {
		HyperbolicFunctionNameContext _localctx = new HyperbolicFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_hyperbolicFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(HYPERBOLIC_FUNCTIONS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorialFunctionNameContext extends ParserRuleContext {
		public FactorialFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorialFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).enterFactorialFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionBuilderParserListener ) ((FunctionBuilderParserListener)listener).exitFactorialFunctionName(this);
		}
	}

	public final FactorialFunctionNameContext factorialFunctionName() throws RecognitionException {
		FactorialFunctionNameContext _localctx = new FactorialFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factorialFunctionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return modulus_sempred((ModulusContext)_localctx, predIndex);
		case 2:
			return addition_sempred((AdditionContext)_localctx, predIndex);
		case 3:
			return multiplication_sempred((MultiplicationContext)_localctx, predIndex);
		case 6:
			return power_sempred((PowerContext)_localctx, predIndex);
		case 8:
			return function_sempred((FunctionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean modulus_sempred(ModulusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addition_sempred(AdditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplication_sempred(MultiplicationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean power_sempred(PowerContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00d2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3"+
		"\7\3\7\5\7d\n\7\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\7\bp\n\b\f\b"+
		"\16\bs\13\b\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\n\3"+
		"\n\7\n\u0083\n\n\f\n\16\n\u0086\13\n\3\13\3\13\3\13\5\13\u008b\n\13\3"+
		"\f\3\f\5\f\u008f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u009f\n\r\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b1\n\22\3\22\3\22"+
		"\5\22\u00b5\n\22\5\22\u00b7\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u00c0\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\33\2\7\4\6\b\16\22\34\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\3\2\26\27\3\2\22\23\3\2\24\25"+
		"\3\2\3\4\3\2\6\7\3\2\b\t\2\u00d0\2\66\3\2\2\2\49\3\2\2\2\6D\3\2\2\2\b"+
		"O\3\2\2\2\n^\3\2\2\2\fc\3\2\2\2\16j\3\2\2\2\20w\3\2\2\2\22~\3\2\2\2\24"+
		"\u008a\3\2\2\2\26\u0096\3\2\2\2\30\u009e\3\2\2\2\32\u00a2\3\2\2\2\34\u00a4"+
		"\3\2\2\2\36\u00a6\3\2\2\2 \u00a8\3\2\2\2\"\u00b6\3\2\2\2$\u00bf\3\2\2"+
		"\2&\u00c1\3\2\2\2(\u00c3\3\2\2\2*\u00c5\3\2\2\2,\u00c7\3\2\2\2.\u00c9"+
		"\3\2\2\2\60\u00cb\3\2\2\2\62\u00cd\3\2\2\2\64\u00cf\3\2\2\2\66\67\5\4"+
		"\3\2\678\7\2\2\38\3\3\2\2\29:\b\3\1\2:;\5\6\4\2;A\3\2\2\2<=\f\3\2\2=>"+
		"\t\2\2\2>@\5\4\3\4?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2"+
		"CA\3\2\2\2DE\b\4\1\2EF\5\b\5\2FL\3\2\2\2GH\f\3\2\2HI\t\3\2\2IK\5\6\4\4"+
		"JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\b\5\1"+
		"\2PQ\5\n\6\2QW\3\2\2\2RS\f\3\2\2ST\t\4\2\2TV\5\b\5\4UR\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X\t\3\2\2\2YW\3\2\2\2Z_\5\f\7\2[\\\5\f\7\2\\]\5"+
		"\n\6\2]_\3\2\2\2^Z\3\2\2\2^[\3\2\2\2_\13\3\2\2\2`a\t\3\2\2ad\5\f\7\2b"+
		"d\5\16\b\2c`\3\2\2\2cb\3\2\2\2d\r\3\2\2\2ef\b\b\1\2fk\5\20\t\2gh\5 \21"+
		"\2hi\5\34\17\2ik\3\2\2\2je\3\2\2\2jg\3\2\2\2kq\3\2\2\2lm\f\4\2\2mn\7\30"+
		"\2\2np\5\16\b\4ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\17\3\2\2\2sq"+
		"\3\2\2\2tx\5\22\n\2uv\t\3\2\2vx\5\20\t\2wt\3\2\2\2wu\3\2\2\2x\21\3\2\2"+
		"\2yz\b\n\1\2z\177\5\24\13\2{|\5\"\22\2|}\5\22\n\4}\177\3\2\2\2~y\3\2\2"+
		"\2~{\3\2\2\2\177\u0084\3\2\2\2\u0080\u0081\f\3\2\2\u0081\u0083\5&\24\2"+
		"\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\23\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u008b\5\26\f\2\u0088"+
		"\u0089\t\3\2\2\u0089\u008b\5\24\13\2\u008a\u0087\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008b\25\3\2\2\2\u008c\u0097\5\30\r\2\u008d\u008f\5\32\16\2\u008e"+
		"\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5\36"+
		"\20\2\u0091\u0092\5 \21\2\u0092\u0097\3\2\2\2\u0093\u0094\5 \21\2\u0094"+
		"\u0095\5\36\20\2\u0095\u0097\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u008e\3"+
		"\2\2\2\u0096\u0093\3\2\2\2\u0097\27\3\2\2\2\u0098\u009f\5\32\16\2\u0099"+
		"\u009f\5 \21\2\u009a\u009b\7\16\2\2\u009b\u009c\5\6\4\2\u009c\u009d\7"+
		"\17\2\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\31\3\2\2\2\u00a0\u00a3\5\34\17\2\u00a1\u00a3\5\36"+
		"\20\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"+
		"\7\13\2\2\u00a5\35\3\2\2\2\u00a6\u00a7\7\f\2\2\u00a7\37\3\2\2\2\u00a8"+
		"\u00a9\7\r\2\2\u00a9!\3\2\2\2\u00aa\u00b7\5(\25\2\u00ab\u00b7\5*\26\2"+
		"\u00ac\u00b7\5,\27\2\u00ad\u00b7\5.\30\2\u00ae\u00b0\5\60\31\2\u00af\u00b1"+
		"\5$\23\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b7\3\2\2\2\u00b2"+
		"\u00b4\5\62\32\2\u00b3\u00b5\5$\23\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6"+
		"\u00ac\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b2\3\2"+
		"\2\2\u00b7#\3\2\2\2\u00b8\u00b9\7\30\2\2\u00b9\u00c0\5\32\16\2\u00ba\u00bb"+
		"\7\30\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\7\21"+
		"\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0"+
		"%\3\2\2\2\u00c1\u00c2\5\64\33\2\u00c2\'\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4"+
		")\3\2\2\2\u00c5\u00c6\7\5\2\2\u00c6+\3\2\2\2\u00c7\u00c8\t\6\2\2\u00c8"+
		"-\3\2\2\2\u00c9\u00ca\t\7\2\2\u00ca/\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\61\3\2\2\2\u00cd\u00ce\7\32\2\2\u00ce\63\3\2\2\2\u00cf\u00d0\7\n\2\2"+
		"\u00d0\65\3\2\2\2\25ALW^cjqw~\u0084\u008a\u008e\u0096\u009e\u00a2\u00b0"+
		"\u00b4\u00b6\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}