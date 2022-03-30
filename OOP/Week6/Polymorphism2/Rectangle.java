import java.text.DecimalFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    /**
     * Rectangle.
     */
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Constructor.
     */
    public Rectangle() {

    }

    /**
     * Constructor.
     */

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = height;
    }

    /**
     * Constructor.
     */
    public Rectangle(Point topLeft, double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = height;
        this.topLeft = topLeft;
    }

    /**
     * set/get height.
     */
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    /**
     * set/get width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    /**
     * set/get topLeft.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * getArea.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimeter.
     */
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            if (this.topLeft == other.topLeft && this.width == other.width
                    && this.length == other.length) {
                return true;
            }
        }
        return false;
    }

    /**
     * hashCode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("#.0");
        return "Rectangle[topLeft=(" + f.format(topLeft.getPointX())
                + "," + f.format(topLeft.getPointY()) + ")," + "width="
                + f.format(width) + ",length=" + f.format(length)
                + ",color=" + color + ",filled=" + filled + "]";
    }

}
