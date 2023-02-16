package ch02.lecture.p04scanner;

import java.util.Scanner;

// 백준 10950
public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int cnt = scan.nextInt();

		for(int i = 0; i < cnt; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
//			int result = x + y;
			System.out.println(x + y);
		}
		
	}
}
