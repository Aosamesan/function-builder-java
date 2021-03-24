package asn.aosamesan.newfunctionbuilder;

import java.util.Date;
import java.util.Objects;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class RNG {
    public static Stream<Double> generateRandomDouble(int size, int max) {
        return Stream.generate(new RandomDoubleSupplier(size, max)).takeWhile(Objects::nonNull);
    }

    public static Stream<Integer> generateRandomInteger(int size, int max) {
        return Stream.generate(new RandomIntegerSupplier(size, max)).takeWhile(Objects::nonNull);
    }


    private static class RandomDoubleSupplier implements Supplier<Double> {
        private final Random random = new Random();
        private int current = 0;
        private final int size;
        private final int max;

        RandomDoubleSupplier(int size, int max) {
            this.size = size;
            this.max = max;
        }

        @Override
        public Double get() {
            if (current < size) {
                random.setSeed(new Date().getTime());
                current++;
                return random.nextDouble() % max;
            }
            return null;
        }
    }

    private static class RandomIntegerSupplier implements Supplier<Integer> {
        private final Random random = new Random();
        private int current = 0;
        private final int size;
        private final int max;

        RandomIntegerSupplier(int size, int max) {
            this.size = size;
            this.max = max;
        }

        @Override
        public Integer get() {
            if (current < size) {
                random.setSeed(new Date().getTime());
                current++;
                return random.nextInt() % max;
            }
            return null;
        }
    }
}
