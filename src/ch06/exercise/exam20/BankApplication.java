package ch06.exercise.exam20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select = 0;
		Account[] account = new Account[100];
		Account ac = new Account();
		String accountNumber;
		String name;
		int money = 0;
		int plus;
		int minus;
		int cnt = 0;
		boolean run = true;

		while (run) {
			System.out.println("==========================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("==========================================");
			System.out.print("선택 > ");
			select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.println("-----------");
				System.out.println("계좌 생성");
				System.out.println("-----------");

				System.out.print("계좌 번호 : ");
				accountNumber = scan.next();
				System.out.print("계좌주 : ");
				name = scan.next();
				System.out.print("초기입금액 : ");
				money = scan.nextInt();

				account[cnt] = new Account(accountNumber, name, money);
				cnt++;

				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;

			case 2:
				System.out.println("-----------");
				System.out.println("계좌 목록");
				System.out.println("-----------");

				for (int i = 0; i < account.length; i++) {
					if (!(account[i] == null)) {
						System.out.println(account[i].getAccountNumber() + "	" + account[i].getName() + "  "
								+ account[i].getMoney());
					} else {
						break;
					}
				}
				break;

			case 3:
				System.out.println("-----------");
				System.out.println("예금");
				System.out.println("-----------");

				System.out.print("계좌 번호 : ");
				accountNumber = scan.next();

				System.out.print("입금액 : ");
				plus = scan.nextInt();

				for (int i = 0; i < account.length; i++) {
					if (!(account[i] == null)) {
						if (account[i].getAccountNumber().equals(accountNumber)) {
							account[i].setMoneyPlus(account[i].getMoney(), plus);
						}
					}
				}
				break;
			case 4:
				System.out.println("-----------");
				System.out.println("출금");
				System.out.println("-----------");

				System.out.print("계좌 번호 : ");
				accountNumber = scan.next();

				System.out.print("출금액 : ");
				minus = scan.nextInt();
				for (int i = 0; i < account.length; i++) {
					if (!(account[i] == null)) {
						if (account[i].getAccountNumber().equals(accountNumber)) {
							account[i].setMoneyMinus(account[i].getMoney(), minus);
							System.out.println("결과 : 출금이 성공되었습니다.");
						}
					}
				}
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}
