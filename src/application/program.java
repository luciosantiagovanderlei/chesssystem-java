package application;

import boargame.Board;
import boargame.Position;
import chess.ChessMatch;


public class program {

	public static void main(String[] args) {
		
		ChessMatch chessmath = new ChessMatch();
		UI.printBoard(chessmath.getpieces());

	}

}
