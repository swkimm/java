package ch02.lecture.p04scanner;

import java.util.Scanner;

public class Test25304 {
	public static void main(String[] args) {
//		String str = """
//				260000
//				4
//				20000 5
//				30000 2
//				10000 6
//				5000 8""";
		Scanner scan = new Scanner(System.in);
		
		int total = scan.nextInt();
		int cnt = scan.nextInt();
		
		for ( int i = 0; i < cnt; i++) {
			int good = scan.nextInt();
			int num = scan.nextInt();
			
			total -= good * num;
		}
			if (total == 0) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
	}

}
