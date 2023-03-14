package ch15.exercise.ch06.example20;

import java.util.*;

public class BankApplication {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Account> list = new ArrayList<>();

		boolean run = true;
		int sel;

		while (run) {
			System.out.println("==========================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("==========================================");
			System.out.print("선택 > ");
			sel = scan.nextInt();

			switch (sel) {
			case 1:
				System.out.println("-----------");
				System.out.println("계좌 생성");
				System.out.println("-----------");

				System.out.print("계좌 번호 : ");
				String num = scan.next();
				System.out.print("계좌주 : ");
				String name = scan.next();
				System.out.print("초기입금액 : ");
				int money = scan.nextInt();
				
				Account ac = new Account();
				ac.setNum(num);
				ac.setName(name);
				ac.setMoney(money);
				
				list.add(ac);
				System.out.println("결제 계좌가 생성되었습니다.");
				break;

			case 2:
				System.out.println("-----------");
				System.out.println("계좌 목록 : ");
				System.out.println("-----------");
				for (Account account : list) {
					System.out.println(account.getNum() + " 	 " + account.getName() + " 		 " + account.getMoney() );
				}
				break;
			
			case 3:
			
			
			}
		}

	}
}
