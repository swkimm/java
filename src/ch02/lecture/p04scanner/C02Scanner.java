package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키보드로 작성하기 : ");
		
		String s1 = scanner.nextLine();
		System.out.print("입력된 값 : ");
		System.out.print(s1);
	}
}
