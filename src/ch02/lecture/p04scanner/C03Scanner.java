package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C03Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 값 입력 : ");
		String str1 = scan.nextLine();
		
		System.out.print("두번째 값 입력 : ");
		String str2 = scan.nextLine();
		
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		System.out.println(i1+i2);
		
	}
}
