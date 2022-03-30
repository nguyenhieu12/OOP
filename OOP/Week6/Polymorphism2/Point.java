import java.text.DecimalFormat;
import java.util.Objects;

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
     * set/get X.
     */
    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * set/get Y.
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

    /**
     * equal.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            if (this.pointX == other.pointX && this.pointY == other.pointY) {
                return true;
            }
        }
        return false;
    }

    /**
     * hashCode.
     */
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }


    /**
     * toString.
     */
    public String toString() {
        DecimalFormat f = new DecimalFormat("#.0");
        return "(" + f.format(pointX) + "," + f.format(pointY) + ")";
    }

}
