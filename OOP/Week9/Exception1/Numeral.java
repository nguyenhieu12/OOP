public class Numeral extends Expression {
    private double value;

    /**
     * Constructor.
     */
    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {

    }

    /**
     * toString.
     */
    public String toString() {
        return String.valueOf((int) this.value);
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return this.value;
    }

}
