public abstract class Shape {
    /**
     * Shape.
     */
    protected String color;
    protected boolean filled;

    /**
     * Constructor.
     */
    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * set/get color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    /**
     * set/get filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    /**
     * getArea.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }

}
