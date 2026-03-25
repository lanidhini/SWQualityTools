/**
 * Demonstrates simple utility methods.
 *
 * @author Suraj
 * @version 1.0
 */
public class SampleClass {

    /** Maximum loop size. */
    private static final int SMALL_MAX = 10;

    /** Constant value used in calculations. */
    private static final int ANSWER = 42;

    /** Toggle condition state. */
    private boolean condition;

    /**
     * Default constructor.
     */
    public SampleClass() {
        this.condition = false;
    }

    /**
     * Entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello from SampleClass!");
    }

    /**
     * Adds 42 to a number.
     *
     * @param value integer input
     * @return value plus 42
     */
    public int addFortyTwo(int value) {
        return value + ANSWER;
    }

    /**
     * Toggles the boolean condition.
     *
     * @return updated condition
     */
    public boolean toggle() {
        condition = !condition;
        return condition;
    }

    /**
     * Builds a formatted number string.
     *
     * @return formatted string
     */
    public String buildNumberString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < SMALL_MAX; i++) {
            builder.append(" ").append(i);
        }
        builder.append(" ]");
        return builder.toString();
    }

    /**
     * Returns the sum of numbers from 1 to parameter.
     *
     * @param parameter upper bound
     * @return computed sum
     */
    public int sumUpTo(int parameter) {
        int sum = 0;
        for (int i = 1; i <= parameter; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Counts even numbers in nested loops.
     *
     * @return computed count
     */
    public int countEvenIterations() {
        int count = 0;
        for (int x = 0; x < SMALL_MAX; x++) {
            for (int i = 0; i < SMALL_MAX; i++) {
                for (int j = i; j < SMALL_MAX; j++) {
                    for (int k = 0; k < 8; k++) {
                        if (k % 2 == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
