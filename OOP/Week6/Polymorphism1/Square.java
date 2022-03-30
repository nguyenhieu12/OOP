public class Square extends Rectangle {
    /**
     * Constructor.
     */
    public Square() {

    }

    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * set/get side.
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public double getSide() {
        return width;
    }

    /**
     * set width.
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * set height.
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return "Square[side=" + width + ",color="
                + color + ",filled=" + filled + "]";
    }

}
