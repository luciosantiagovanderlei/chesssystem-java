package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import boargame.Board;
import boargame.Position;
import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;


public class program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessmath = new ChessMatch();
		List<ChessPiece> captured = new ArrayList<>();
		
		while (!chessmath.getcheckMate()) {
			try {
				UI.clearScreen();	
				UI.printMatch(chessmath, captured);
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessmath.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessmath.getpieces(), possibleMoves);
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessmath.performChessMove(source, target);
				
				if (capturedPiece != null) {
					captured.add(capturedPiece);
					
				}
				
				if (chessmath.getpromoted() != null) {
					System.out.print("Enter piece for promotion (B/N/R/Q)");
					String type = sc.nextLine();
					chessmath.replacedPromotedPiece(type);
				}
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printMatch(chessmath, captured);

	}
}
