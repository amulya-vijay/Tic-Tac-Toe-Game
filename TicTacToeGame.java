package game;

import java.util.Scanner;

public class TicTacToeGame {
	
	static char[] board = new char[10];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void displayGameBoard() {
		
		
        System.out.println(" " + 1 + " | "
                           + 2 + " | " + 3
                           + " ");
        System.out.println("---|---|---");
        System.out.println(" " + 4 + " | "
                           + 5 + " | " + 6
                           + " ");
        System.out.println("---|---|---");
        System.out.println(" " + 7 + " | "
                           + 8 + " | " + 9
                           + "  ");
	}
	
	public static void chooseCharacterToPlay() {
		
		char computer = 'X';
		System.out.println("Choose a character to play: 'X' or 'O'");
		char user = sc.next().charAt(0);
		if(user=='X') {
			computer = 'O';
		}else if(user=='O'){
			computer = 'X';
		}else {
			System.out.println("Invalid character input.");
		}
		System.out.println("User: "+user);
		System.out.println("Computer: "+computer);
	}
	
	public static void main(String[] args) {
		
		chooseCharacterToPlay();
		displayGameBoard();

	}

}
