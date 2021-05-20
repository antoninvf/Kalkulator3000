package logic;

public class Math {

    public static float add(float a, float b) {
        return a + b;
    }

    public static float subtract(float a, float b) {
        return a - b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float divide(float a, float b) {
        if(b == 0) {
            return 0;
        }
        else {
            return a / b;
        }
    }

    public static float power(float a, float power) {
        float result = 1;
        for (int i = 0; i < power; i++) {
            result *= a;
        }
        return result;
    }

    public static float factorial(float n) {
        if(n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }


}
