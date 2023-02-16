package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C05Scanner {

	// 백준 1000
	public static void main(String[] args) {
//		String input = "1 2";
//		Scanner scan = nwe Scanner(input);
		Scanner scan = new Scanner(System.in);
		
//		System.out.print();
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int result = x + y;
		System.out.println(result);
	}
}
