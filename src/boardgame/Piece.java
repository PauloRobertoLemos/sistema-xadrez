package boardgame;

public abstract class Piece {

    protected Position position;
    private final Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (boolean[] booleans : mat) {
            int j;
            for (j = 0; j < mat.length; j++) {
                if (booleans[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract boolean possibleMoves(Position target);
}
