package com.bilgeadam.boost.java.ödev;

import java.util.Scanner;

public class Satranc {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		BAUtils.header("Atın Olası Hareketleri");
		int[][] moves = { { 2, 1 }, { 2, -1 }, { 1, 2 }, { 1, -2 }, { -2, 1 }, { -2, -1 }, { -1, 2 }, { -1, -2 } };
		do {
			String[][] board = createBoard();
			
			printBoard(board);
			System.out.println();
			System.out.println();
			System.out.println();
			
			int[] point = startingPoint();
			
			printBoard(possibleMoves(point, moves));
			
			// moveList(point, moves);
			System.out.println("hamle yapmak için 'e' tuşuna basınız");
			int x = scanner.nextInt();
			
			if (x == 1) {
				int[] point2 = startingPoint();
				printBoard(possibleMoves(point, moves));
				
			}
			
		} while (BAUtils.wantToEnd(
				"\n\n" + "hamle yapmak  isterseniz herhangi bir tuşa basın Çıkmak isterseniz q tuşuna basınız ", "q"));
		
	}
	
	private static void moveList(int[] point, int[][] moves) {
		String[][] board = createBoard();
		String[] possibleStrings = new String[9];
		
		board[point[0]][point[1]] = "( AT)";
		for (int i = 0; i < moves.length; i++) {
			int[] possibleMove = moves[i];
			int posX = point[0] + possibleMove[0];
			int posY = point[1] + possibleMove[1];
			if ((posX >= 1 && posX <= 8) && (posY >= 1 && posY <= 8)) {
				
				posX = posX + 96;
				char karakter = (char) (posX);
				
				String yeniString = Character.toString(karakter);
				possibleStrings[i] = yeniString + posY;
				
			}
			
		}
		
		System.out.println("\t\n**Olası Hamleler**");
		for (String string : possibleStrings) {
			if (!(string == null))
				System.out.print(string + "  ");
			
		}
		System.out.println();
		System.out.println();
		
	}
	
	private static void movesOfPoint() {
		String[][] board = createBoard();
		int[] point = startingPoint();
		board[point[0]][point[1]] = "( AT)";
		
	}
	
	private static String[][] possibleMoves(int[] point, int[][] moves) {
		String[][] board = createBoard();
		
		board[point[0]][point[1]] = "( AT)";
		for (int i = 0; i < moves.length; i++) {
			int[] possibleMove = moves[i];
			int posX = point[0] + possibleMove[0];
			int posY = point[1] + possibleMove[1];
			if ((posX >= 1 && posX <= 8) && (posY >= 1 && posY <= 8)) {
				board[posX][posY] = "( XX)";
			}
		}
		moveList(point, moves);
		return board;
		
	}
	
	private static int[] startingPoint() {
		int[] retval = new int[2];
		String a = "abcdefgh";
		boolean İsCorret;
		do {
			İsCorret = false;
			int posX = -1;
			String point = BAUtils
					.readString("lütfen bir hareket noktası belirleyin a2 gibi ( \'a-h' ve \'1-8' arası )");
			char ch = point.charAt(0);
			int posY = point.charAt(1) - '0';
			int value = Integer.valueOf(ch - 'a');
			
			if (value >= 0 && value <= 8 && posY >= 1 && posY <= 8) {
				for (int i = 0; i < 8; i++) {
					if (a.charAt(i) == ch) {
						
						posX = a.indexOf(ch) + 1;
						
						retval[0] = posX;
						retval[1] = posY;
						İsCorret = true;
					}
					
				}
				
			}
			
		} while (!İsCorret);
		
		return retval;
	}
	
	private static void printBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + "|");
			}
			System.out.println("\n------------------------------------------------------");
		}
		
	}
	
	private static String[][] createBoard() {
		String[][] board = new String[9][9];
		String rowString = " ";
		char a = 'a' - 1;
		int sayac = 0;
		int sayac1 = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j == 0) {
					board[i][j] = Character.toString(a + sayac) + "----";
					sayac++;
					
				}
				
				if (i == 0) {
					board[i][j] = Character.toString('0' + sayac1) + "    ";
					sayac1++;
				}
				if (i != 0 && j != 0) {
					board[i][j] = rowString + "(  )";
				}
				
			}
			
		}
		return board;
		
	}
}
