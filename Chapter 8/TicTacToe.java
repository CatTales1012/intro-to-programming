/*
Author: Cat Smith
Assignment: 8-9, Tic Tac Toe
Date: Dec 16
*/
import java.util.Scanner;
class TicTacToe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] board = {
			{"[]", "[]", "[]"},
			{"[]", "[]", "[]"},
			{"[]", "[]", "[]"}
		};
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 9; i++){
			System.out.print("Player X: Enter 0, 1, or 2 for row: ");
			int xRow = input.nextInt();
			System.out.print("Player X: Enter 0, 1, or 2 for column: ");
			int xCol = input.nextInt();
			
			board[xRow][xCol] = "X";
			
			for (int row = 0; row < 3; row++){
				for(int col = 0; col < 3; col++){
					System.out.print(board[row][col] + " ");
				}
				System.out.println();
			}
			
			System.out.print("Player O: Enter 0, 1, or 2 for row: ");
			int oRow = input.nextInt();
			System.out.print("Player O: Enter 0, 1, or 2 for column: ");
			int oCol = input.nextInt();
			
			board[oRow][oCol] = "O";
			
			for (int row = 0; row < 3; row++){
				for(int col = 0; col < 3; col++){
					System.out.print(board[row][col] + " ");
				}
				System.out.println();
			}
			
			String winner = null;
			switch (winner) {
				case (board[0][0] && board [0][1] && board[0][2]).equals("X"): winner = "X"; break;
				case (board[1][0] && board [1][1] && board[1][2]).equals("X"): winner = "X"; break;
				case (board[2][0] && board [2][1] && board[2][2]).equals("X"): winner = "X"; break;
				case (board[0][0] && board [1][1] && board[2][2]).equals("X"): winner = "X"; break;
				case (board[0][2] && board [0][1] && board[2][0]).equals("X"): winner = "X"; break;
				case (board[0][0] && board [0][1] && board[0][2]).equals("O"): winner = "O"; break;
				case (board[1][0] && board [1][1] && board[1][2]).equals("O"): winner = "O"; break;
				case (board[2][0] && board [2][1] && board[2][2]).equals("O"): winner = "O"; break;
				case (board[0][0] && board [1][1] && board[2][2]).equals("O"): winner = "O"; break;
				case (board[0][2] && board [0][1] && board[2][0]).equals("O"): winner = "O"; break;
				default: System.out.println("Nobody won..");
			}	
			
			System.out.print("Player " + winner + "Wins!");
		}
	}
}