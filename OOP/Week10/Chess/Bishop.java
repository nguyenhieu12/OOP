public class Bishop extends Piece {
    /**
     * Constructor.
     */
    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor.
     */
    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    /**
     * symbol.
     */
    @Override
    public String getSymbol() {
        return "B";
    }

    /**
     * move.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        int minX = this.getCoordinatesX();
        int minY = this.getCoordinatesY();
        for (int i = minX + 1, j = minX + 1; i < 10 && j < 10; i++, j++) {
            if (x == i && y == j) {
                if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
                    return false;
                }
                for (int a = minX + 1, b = minY + 1; a < x && b < y; a++, b++) {
                    if (board.getAt(a, b) != null) {
                        return false;
                    }
                }
                return true;
            }
            }

        for (int i = minX + 1, j = minY - 1; i < 10 && j >= 0; i++, j--) {
            if (x == i && y == j) {
                if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
                    return false;
                }
                for (int a = minX + 1, b = minY - 1; a < x && b >= y; a++, b--) {
                    if (board.getAt(a, b) != null) {
                        return false;
                    }
                }
                return true;
                }
            }

        for (int i = minX - 1, j = minY - 1; i >= 0 && j >= 0; i--, j--) {
            if (x == i && y == j) {
                if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
                    return false;
                }
                for (int a = minX - 1, b = minY - 1; a >= x && b >= y; a--, b--) {
                    if (board.getAt(a, b) != null) {
                        return false;
                    }
                }
                return true;
            }

        }

        for (int i = minX - 1, j = minY + 1; i >= 0 && j < 10; i--, j++) {
            if (x == i && y == j) {
                if (board.getAt(x, y) != null && board.getAt(x, y).getColor().equals(getColor())) {
                    return false;
                }
                for (int a = minX - 1, b = minY + 1; a >= x && b < y; a--, b++) {
                    if (board.getAt(a, b) != null) {
                        return false;
                    }
                }
                return true;
            }

        }
        return false;
    }

}

