package ch02.lecture.p05print;

import java.util.Scanner;

// 두 개의 수를 입력 받아서 더하는 코드 
public class C05Printf {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("첫번째 수는 : " );
		int num1 = scan.nextInt();
		System.out.printf("번째 수는 : " );
		int num2 = scan.nextInt();

		int sum = num1 + num2;
		
		System.out.printf("%d + %d = %d", num1, num2, sum);
	
	}
}
