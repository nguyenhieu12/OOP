public class Point {
    /**
     * Point.
     */
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * set/get.
     */
    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * set/get.
     */
    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2)
                + Math.pow(this.pointY - other.pointY, 2));
    }
}
