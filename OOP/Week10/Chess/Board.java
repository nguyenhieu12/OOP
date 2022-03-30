import java.util.ArrayList;
import java.util.List;

public class Board {
    /**
     * Board.
     */
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<Piece>();

    /**
     * Constructor.
     */
    public Board() {

    }

    /**
     * add.
     */
    public void addPiece(Piece piece) {
        int checkSize = 0;
        for (int i = 0; i < pieces.size(); i++) {
            if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                    && !pieces.get(i).checkPosition(piece)) {
                checkSize++;
            }
        }
        if (checkSize == pieces.size()) {
            pieces.add(piece);
        }
    }

    /**
     * get.
     */
    public Piece getAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                return pieces.get(i);
            }
        }
        return null;
    }

    /**
     * remove.
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x
                    && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(pieces.get(i));
            }
        }
    }

    /**
     * validate.
     */
    public boolean validate(int x, int y) {
        if ((x >= 1 && x <= 8) && (y >= 1 && y <= 8)) {
            return true;
        }
        return false;
    }

    /**
     * set/get.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

}
