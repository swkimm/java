package ch04.Exercise;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int cash = 0;
		int money = 0;

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");

			String strNum = scanner.nextLine();

			if (strNum.equals("1")) {
				System.out.print("예금액> ");
				cash = scanner.nextInt();
				money += cash;
//				System.out.println("");
				scanner.nextLine();
				
			} else if (strNum.equals("2")) {
				System.out.print("출금액> ");
				cash = scanner.nextInt();
				money -= cash;
				strNum = scanner.nextLine();


			} else if (strNum.equals("3")) {
				System.out.print("잔고> ");
				System.out.println(money);

			} else if (strNum.equals("4")) {
				run = false;

			} else {
				System.out.println("잘못입력했습니다.");
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}
}
