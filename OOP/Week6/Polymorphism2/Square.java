import java.text.DecimalFormat;
import java.util.Objects;

public class Square extends Rectangle {
    /**
     * Constructor.
     */
    public Square() {

    }

    /**
     * Constructor.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Constructor.
     */
    public Square(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Constructor.
     */
    public Square(Point point, double side, String color, boolean filled) {
        super(point, side, side, color, filled);
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
     * hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, width);
    }

    /**
     * equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            if (this.topLeft == other.topLeft && this.width == other.width) {
                return true;
            }
        }
        return false;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("#.0");
        return "Square[topLeft=(" + f.format(topLeft.getPointX())
                + "," + f.format(topLeft.getPointY()) + ")," + "side="
                + f.format(width) + ",color=" + color + ",filled="
                + filled + "]";
    }

}
