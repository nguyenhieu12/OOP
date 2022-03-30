public class Square extends Expression {
    /**
     * Square.
     */
    private Expression expression;

    /**
     * Constructor.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + this.expression.toString() + ") " + "^ 2";
    }

    /**
     * Evaluate.
     */
    public double evaluate() {
        return this.expression.evaluate() * this.expression.evaluate();
    }

}
