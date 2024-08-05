package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {

    Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
