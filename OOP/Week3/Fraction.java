public class Fraction {
    /**
     * Solution.
     */
    private int numerator;
    private int denominator = 1;

    /**
     * constructor.
     */
    Solution(int a, int b) {
        if (b != 0) {
            this.numerator = a;
            this.denominator = b;
        }
    }

    /**
     * set/get.
     */
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    
    public void setNumerator(int a) {
        numerator = a;
    }
    
    public void setDenominator(int b) {
        if (b != 0) {
            denominator = b;
        }
    }

    /** 
     * gcd.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a == 0 && b != 0) {
            return b;
        }
        int tmp;
        while (b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    /**
     * reduce.
     */
    public Solution reduce() {
        int ucln = gcd(numerator, denominator);
        numerator /= ucln;
        denominator /= ucln;
        return this;
    }

    /** 
     * add.
     */
    public Solution add(Solution other) {
        numerator = numerator * other.denominator + denominator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    /** 
     * subtract.
     */
    public Solution subtract(Solution other) {
        numerator = numerator * other.denominator - denominator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    /** 
     * multiply.
     */
    public Solution multiply(Solution other) {
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
        return this;
    }

    /** 
     * divide.
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            numerator = numerator * other.denominator;
            denominator = denominator * other.numerator;
        }
        return this;
    }

    /** 
     * equals.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            this.reduce();
            other.reduce();
            if (this.numerator == other.numerator && this.denominator == other.denominator) {
                return true;
            }
        }
        return false;
    }
    
} 