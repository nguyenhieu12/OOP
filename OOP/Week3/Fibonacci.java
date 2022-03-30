public class Fibonacci {
    /**
     * find the n(th) fibonacci number .
     */
    public static long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        long lm = Long.MAX_VALUE;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                if (lm - f0 >= f1) {
                    fn = f0 + f1;
                } else {
                    return lm;
                }
            }
        }
        return fn;
    }
}    