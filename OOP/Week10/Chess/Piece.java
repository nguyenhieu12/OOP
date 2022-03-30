public abstract class Piece {
    /**
     * Piece.
     */
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Constructor.
     */
    public Piece(int coordinatesX, int coordinatesY) {
            this.color = "white";
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;

    }

    /**
     * Constructor.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
            this.color = color;
    }

    /**
     * symbol.
     */
    public abstract String getSymbol();

    /**
     * move.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * set/get.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * set/get.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * set/get.
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * pos.
     */
    public boolean checkPosition(Piece piece) {
        return this.getCoordinatesX() == piece.getCoordinatesX()
                && this.getCoordinatesY() == piece.getCoordinatesY();
    }

}
