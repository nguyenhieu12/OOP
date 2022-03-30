public class Multiplication extends BinaryExpression {
    /**
     * Constructor.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "(" + this.left.toString() + " * " + this.right.toString() + ")";
    }

    /**
     * Evaluate.
     */
    @Override
    public double evaluate() {
        return this.left.evaluate() * this.right.evaluate();
    }

}
