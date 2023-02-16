package ch02.lecture.p04scanner;

import java.util.Scanner;
// 백준 2525
public class C06Scanner {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
//		Scanner scan2 = new Scanner(System.in);

		int hour = scan1.nextInt();
		int min = scan1.nextInt();
		System.out.println();
		int time = scan1.nextInt();

		int result = min + time;
		int currentHour = ((hour + (result / 60)) % 24);
		int currentMin = result % 60;

		System.out.println(currentHour + " " + currentMin);

	}
}
