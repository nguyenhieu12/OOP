public class GCD {
    /**
     * Class gcd .
     */
    public int gcd(int a, int b) {
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }

        return (a < 0 ? -a : a);
    }
} 