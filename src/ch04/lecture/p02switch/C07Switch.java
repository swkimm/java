package ch04.lecture.p02switch;

import java.util.Scanner;

public class C07Switch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("주민등록 번호 7번째 자리 >  ");
		int num = scan.nextInt();

		String gender1 = "";

//		switch (num) {
//		case 1:
//		case 3:
//			gender1 = "남자";
//		case 2 :
//		case 4 :
//			gender1 = "여자";
//		default :
//			gender1 = "잘못입력";			
//		}
//		System.out.println("입력된 성별은 " + gender1 + "입니다. ");
		
		String gender2 ="";
		switch (num) {
		case 1,3 -> { 
		gender2 = "남자";
		
		}
		case 2,4 -> gender2 = "여자";
		default -> gender2 = "잘못입력";
		};
		
		System.out.println("입력된 성별은 " + gender2 + "입니다. ");

	}

}
