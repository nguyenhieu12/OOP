public class Circle extends Shape {
    /**
     * Circle.
     */
    protected double radius;

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

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
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
     * toString.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color="
                + color + ",filled=" + filled + "]";
    }

}
