package ch02.lecture.p05print;

import java.util.Scanner;

public class C04Printf {
	public static void main(String[] args) {
		// 아규먼트는 순서대로 적용됨
		System.out.printf("%d, %d%n", 3, 9);
		System.out.printf("%d, %f%n", 3, 3.15);

		System.out.printf("");

		Gugudan dan = new Gugudan();
		
		System.out.printf("출력할 구구단의 단을 입력하시오 : ");
		dan.input();
		dan.dan();
		
	}

}

class Gugudan {
	int num1 = 0;
	void input () {
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		
	}
	
	void dan () {
		for (int i = num1; i < num1+1; ) {
			for (int j = 1; j < 10; j++) {
				int result =i * j;
				System.out.printf("%d * %d = %d%n", i , j, result);
				
			}
			break;
		}
		
	}
}
