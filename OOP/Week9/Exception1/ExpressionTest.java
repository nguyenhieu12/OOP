public class ExpressionTest {
    /**
     * Main.
     */
    public static void main(String[] args) {
        Expression number = new Numeral(1);
        Expression number1 = new Numeral(0);
        Expression square1 = new Square(number);
        Expression div = new Division(square1, number1);
        System.out.println(div.toString());
        System.out.println(square1.toString());
    }

}
