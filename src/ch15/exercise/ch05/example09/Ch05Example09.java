package ch15.exercise.ch05.example09;

import java.util.*;

public class Ch05Example09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Integer> scores = new ArrayList<>();

		boolean run = true;
		int sel;
		int stuNum = 0;

		while (run) {
			System.out.println("======================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("======================================================");
			System.out.print("선택> ");
			sel = scan.nextInt();
			switch (sel) {

			case 1:
				System.out.print("학생수> ");
				stuNum = scan.nextInt();
//				stuNum = scores.size();
				break;
			case 2:
				for (int i = 0; i < stuNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores.add(scan.nextInt());
				}
				break;

			case 3:
				int i = 0;
				for (int e : scores) {
					System.out.println("scores[" + i + "]> " + e);
					i++;
				}
				break;

			case 4:
				int max = Integer.MIN_VALUE;
				int sum = 0;

				for (Integer e : scores) {
					max = Math.max(max, e);
				}

				for (int s : scores) {
					sum += s;
				}

				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + sum / scores.size());

				break;

			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

	}
}
