public class Rectangle extends Shape {
    /**
     * Rectangle.
     */
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
     * toString.
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }

}