package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String input = "3 33 555 50";
		Scanner scan = new Scanner(input);
		
		int num1 = scan.nextInt();
		System.out.println(num1);
		int num2 = scan.nextInt();
		System.out.println(num2);
		int num3 = scan.nextInt();
		System.out.println(num3);
		int num4 = scan.nextInt();
		System.out.println(num4);
		
		System.out.println(num3 + num4); // 605
	}
}
