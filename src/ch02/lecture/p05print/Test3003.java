package ch02.lecture.p05print;

import java.util.Scanner;

public class Test3003 {

	public static void main(String[] args) {
//		String input = """
//				0 1 2 2 2 7
//				"""; 
		
//		Scanner scan = new Scanner(input);
		Scanner scan = new Scanner(System.in);
		
		int king = scan.nextInt();
		int queen = scan.nextInt();
		int rook = scan.nextInt();
		int bishop = scan.nextInt();
		int knight = scan.nextInt();
		int pawn = scan.nextInt();

		
		
		System.out.printf("%d %d %d %d %d %d", 
				(1 - king), 
				(1 - queen),
				(2 - rook),
				(2 - bishop),
				(2 - knight),
				(8 - pawn)
				);
	}

}
