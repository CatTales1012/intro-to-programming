/*
Author: Cat Smith
Assignment: 8-9, Tic Tac Toe
Date: Dec 17
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
		//[] == available spaces 
		int counter = 0;
		String winner = null;
		
		for (int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
		
		while (winner == null) {
			System.out.print("Player X: Enter 0, 1, or 2 for row: ");
			int xRow = input.nextInt();
			System.out.print("Player X: Enter 0, 1, or 2 for column: ");
			int xCol = input.nextInt();
			
			while (!board[xRow][xCol].equals("[]")) {
				System.out.println("That location is taken. Try another.");
				System.out.print("Player X: Enter 0, 1, or 2 for row: ");
				xRow = input.nextInt();
				System.out.print("Player X: Enter 0, 1, or 2 for column: ");
				xCol = input.nextInt();
			}
			
			board[xRow][xCol] = "X";
			
			for (int row = 0; row < 3; row++){
				for(int col = 0; col < 3; col++){
					System.out.print(board[row][col] + " ");
				}
				System.out.println();
			}
			
			if ((board[0][0]).equals("X") && (board[0][1]).equals("X") && (board[0][2]).equals("X")){
				winner = "X";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if ((board[1][0]).equals("X") && (board[1][1]).equals("X") && (board[1][2]).equals("X")){
				winner = "X";
				System.out.print("Player " + winner + " Wins!");
			} 
			else if ((board[2][0]).equals("X") && (board[2][1]).equals("X") && (board[2][2]).equals("X")){
				winner = "X";
				System.out.print("Player " + winner + " Wins!");
			}
			else if ((board[0][0]).equals("X") && (board[1][1]).equals("X") && (board[2][2]).equals("X")){ 
				winner = "X";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if ((board[0][2]).equals("X") && (board[1][1]).equals("X") && (board[2][0]).equals("X")){
				winner = "X";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if ((board[0][0]).equals("O") && (board[0][1]).equals("O") && (board[0][2]).equals("O")){
				winner = "O";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if ((board[1][0]).equals("O") && (board[1][1]).equals("O") && (board[1][2]).equals("O")){
				winner = "O";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if ((board[2][0]).equals("O") && (board[2][1]).equals("O") && (board[2][2]).equals("O")){
				winner = "O";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if ((board[0][0]).equals("O") && (board[1][1]).equals("O") && (board[2][2]).equals("O")){
				winner = "O";
				System.out.print("Player " + winner + " Wins!");
			} 
			else if ((board[0][2]).equals("O") && (board[1][1]).equals("O") && (board[2][0]).equals("O")){
				winner = "O";
				System.out.print("Player " + winner + " Wins!");
			}  
			else if(counter > 9) {
				winner = "No one";
				System.out.println("No one won this round!");
			}
			
			if (winner != null) {
				System.exit(0);
			}
			
			System.out.print("Player O: Enter 0, 1, or 2 for row: ");
			int oRow = input.nextInt();
			System.out.print("Player O: Enter 0, 1, or 2 for column: ");
			int oCol = input.nextInt();
			
			while (!board[oRow][oCol].equals("[]")) {
				System.out.println("That location is taken. Try another.");
				System.out.print("Player O: Enter 0, 1, or 2 for row: ");
				oRow = input.nextInt();
				System.out.print("Player O: Enter 0, 1, or 2 for column: ");
				oCol = input.nextInt();
			}
			
			board[oRow][oCol] = "O";
			
			for (int row = 0; row < 3; row++){
				for(int col = 0; col < 3; col++){
					System.out.print(board[row][col] + " ");
				}
				System.out.println();
			}
			
			counter += 2;
			
		}
	}
}