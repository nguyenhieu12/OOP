public class Triangle implements GeometricObject {
    /**
     * Triangle.
     */
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
	if ((p1.getPointX() == p2.getPointX() && p2.getPointY() == p2.getPointY())
                || (p2.getPointX() == p3.getPointX() && p2.getPointY() == p3.getPointY())
                || (p1.getPointX() == p3.getPointX() && p1.getPointY() == p3.getPointY()) 
                || (p1.getPointY() == p2.getPointY() && p2.getPointY() == p3.getPointY())) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * get.
     */
    public Point getP1() {
        return p1;
    }

    /**
     * get.
     */
    public Point getP2() {
        return p2;
    }

    /**
     * get.
     */
    public Point getP3() {
        return p3;
    }

    /**
     * area.
     */ 
    @Override
    public double getArea() {
        return (p1.getPointX() * (p2.getPointY() - p3.getPointY()) + p2.getPointX()
                * (p3.getPointY() - p1.getPointY()) + p3.getPointX() * (p1.getPointY()
                - p2.getPointY())) / 2;
    }

    /**
     * perimeter.
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * toString.
     */
    @Override
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY());
    }
}
