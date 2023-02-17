package ch02.lecture.p05print;

import java.util.Scanner;

public class Test11021 {
	public static void main(String[] args) {
		
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
					""";
		
		Scanner scan = new Scanner(input);
		
		int cnt = scan.nextInt();
		
		for (int i = 1; i <= cnt; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int result = num1 + num2;
			System.out.printf("Case #%d: %d%n", i , result );
		}
	}
}
