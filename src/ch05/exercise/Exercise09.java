package ch05.exercise;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {

		boolean run = true;
		Scanner scan = new Scanner(System.in);
		int[] scores = {}; // 학생수 배열
		int select = 0; // 메뉴 선택
		int student = 0; // 학생수
		int max = 0; // 최대값
		int sum = 0; // 점수 총합
		double avg = 0.0; // 점수 평균

		while (run) {
			System.out.println("======================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("======================================================");
			System.out.print("선택> ");
			select = scan.nextInt();

			switch (select) {
			case 1:
				System.out.print("학생수> ");
				student = scan.nextInt();
				scores = new int[student];
				break;

			case 2:
				for (int i = 0; i < student; i++) {
					System.out.print("scores[" + i + "] > ");
					scores[i] = scan.nextInt();
				}
				break;
			case 3:
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
				break;
			case 4: // 분석 최대값, 평균
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				avg = sum / scores.length;

				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);

				break;

			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				break;

			}

		}
	}

}
