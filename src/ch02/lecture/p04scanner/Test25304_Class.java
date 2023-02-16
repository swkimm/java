package ch02.lecture.p04scanner;

import java.util.Scanner;

public class Test25304_Class {
	public static void main(String[] args) {

		Res r = new Res();
		InputNum in = new InputNum();
		int a = in.num1;
		int b = in.num2;
		r.calc(a, b);
	}
}

class Res {
	void calc(int a, int b) {
		System.out.println(a + b);
	}
}

class InputNum {
	Scanner scan = new Scanner(System.in);
	public int num1 = scan.nextInt();
	public int num2 = scan.nextInt();
}