package chess;

import java.util.Iterator;

import boargame.Board;
import boargame.Piece;
import boargame.Position;

public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
}
