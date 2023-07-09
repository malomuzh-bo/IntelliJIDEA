package Classes;

public class Calculator {
    public static int findMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int findMin(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static float getAvg(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0f;
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error__!");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

