public class Circle implements GeometricObject {
    /**
     * Circle.
     */
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Constructor.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * set/get.
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    /**
     * set/get.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * area.
     */
    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    /**
     * perimeter.
     */
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * toString.
     */
    @Override
    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]", center.getPointX(),
                center.getPointY(), radius);
    }
}
