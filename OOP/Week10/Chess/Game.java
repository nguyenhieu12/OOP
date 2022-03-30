import java.util.ArrayList;

public class Game {
    /**
     * Game.
     */
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Constructor.
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * move.
     */
    public void movePiece(Piece piece, int x, int y) {
        Piece killedPiece = board.getAt(x, y);
        if (piece.canMove(board, x, y)) {
            if (killedPiece != null) {
                board.removeAt(x, y);
                Move moves = new Move(piece.getCoordinatesX(), piece.getCoordinatesY(),
                        x, y, piece, killedPiece);
                moveHistory.add(moves);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);

        }

    }

    /**
     * set/get.
     */
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * history.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

}
