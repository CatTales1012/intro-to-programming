/*
Author: Cat Smith
Assignment: 8-9, Tic Tac Toe
Date: Dec 13
*/
import java.util.Scanner;
class TicTacToe {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] board = new String[3][3];
		System.out.print("Player X: Enter 0, 1, or 2 for row: ");
		int xRow = input.nextInt();
		System.out.print("Player X: Enter 0, 1, or 2 for column: ");
		int xCol = input.nextInt();
		
		board[xRow][xCol] = "X";
		
		System.out.print("Player O: Enter 0, 1, or 2 for row: ");
		int oRow = input.nextInt();
		System.out.print("Player O: Enter 0, 1, or 2 for column: ");
		int oCol = input.nextInt();
		
		board[oRow][oCol] = "O"
	}
}