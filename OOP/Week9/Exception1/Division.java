public class Division extends BinaryExpression {

    /**
     * Constructor.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " / " + this.right.toString() + ")";
    }

    /**
     * Evaluate.
     */
    @Override
    public double evaluate() throws ArithmeticException {
        if (this.right.evaluate() == 0) {
            throw new ArithmeticException("Error!");
        }
        return this.left.evaluate() / this.right.evaluate();
    }

}
