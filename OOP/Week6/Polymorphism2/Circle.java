import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape {
    /**
     * Circle.
     */
    protected double radius;
    protected Point center;

    /**
     * Constructor.
     */
    public Circle() {

    }

    /**
     * Constructor.
     */

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    /**
     * set/get center.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    /**
     * set/get radius.
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            if (this.center == other.center && this.radius == other.radius) {
                return true;
            }
        }
        return false;
    }

    /**
     * hashCode.
     */
    public int hashCode() {
        return Objects.hash(radius, center);
    }

    /**
     * toString.
     */
    public String toString() {
        DecimalFormat f = new DecimalFormat("#.0");
        return "Circle[center=(" + f.format(center.getPointX()) + ","
                + f.format(center.getPointY()) + "),radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
    }

}
