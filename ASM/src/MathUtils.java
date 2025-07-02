/**
 * Utility class for basic math operations.
 */
public class MathUtils {

    /**
     * Adds two integers.
     * @param a first integer
     * @param b second integer
     * @return the sum of a and b
     */
    public static int add(int a, int b) {
        return a + b; // simple addition
    }

    /**
     * Subtracts one integer from another.
     * @param a minuend
     * @param b subtrahend
     * @return result of a - b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    // BAD: Missing documentation
    public static int mul(int x, int y) {
        int z = x * y; // vague variable name
        return z;
    }

    // BAD: Poor naming and no comment
    public static int d(int x, int y) {
        if (y == 0) return -1;
        return x / y;
    }
}
