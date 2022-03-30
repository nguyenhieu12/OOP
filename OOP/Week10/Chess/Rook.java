public class Rook extends Piece {
    /**
     * Constructor.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * symbol.
     */
    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * move.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if ((this.getCoordinatesX() != x && this.getCoordinatesY() != y)) {
            return false;
        }
        if (!board.validate(x, y)) {
            return false;
        }
        if (x == getCoordinatesX()) {
            if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
                return false;
            }
            int minY = Math.min(y, this.getCoordinatesY());
            int maxY = Math.max(y, this.getCoordinatesY());
            for (int i = minY + 1; i < maxY; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }

        }
        if (y == getCoordinatesY()) {
            if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
                return false;
            }
            int maxX = Math.max(x, this.getCoordinatesX());
            int minX = Math.min(x, this.getCoordinatesX());
            for (int i = minX + 1; i < maxX; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
