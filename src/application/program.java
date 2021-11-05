package application;

import java.util.Scanner;

import boargame.Board;
import boargame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;


public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessmath = new ChessMatch();
		
		while (true) {
		UI.printBoard(chessmath.getpieces());
		System.out.println();
		System.out.print("Source: ");
		ChessPosition source = UI.readChessPosition(sc);
		
		System.out.println();
		System.out.print("Target: ");
		ChessPosition target = UI.readChessPosition(sc);
		
		ChessPiece capturedPiece = chessmath.performChessMove(source, target);

		}

	}
}
