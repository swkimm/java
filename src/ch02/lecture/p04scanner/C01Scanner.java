package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C01Scanner {
	public static void main(String[] args) {
		
		// Scanner 로 키보드로 부터 입력받은 내용을 프로그램으로 가져올 수 있음.
		
		// String 도 가능
		
		String input1 = """ 
				동해물과 백두산이 
				마르고 닳도록 
				하느님이 보우하사
				우리나라 만세 """;
		
		Scanner scan = new Scanner(input1);
		String inputData = scan.nextLine();
		System.out.println(inputData);
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());

		
	}
}
