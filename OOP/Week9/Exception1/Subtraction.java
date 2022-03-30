public class Subtraction extends BinaryExpression {
    /**
     * Constructor.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " - " + this.left.toString() + ")";
    }

    /**
     * Evaluate.
     */
    @Override
    public double evaluate() {
        return this.left.evaluate() - this.right.evaluate();
    }
}
