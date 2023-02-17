package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class Test2588 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		// 385
		int firstNum = num2 / 100;
		int SecNum = (num2 % 100) / 10;
		int thirdNum = (num2 % 100) % 10;

		System.out.println(firstNum);
		System.out.println(SecNum);
		System.out.println(thirdNum);

		int result1 = num1 * thirdNum;
		int result2 = num1 * SecNum;
		int result3 = num1 * firstNum;
		int result4 = num1 * num2;
		// int result4 = result1 + (result2 * 10) + (result3 * 100)

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
