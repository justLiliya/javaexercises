public class Factorial {

    //рекурсивно

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;

        }
        return n * getFactorial(n - 1);
    }

    //циклом
    public static int getFactorialfromCycle(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


}
