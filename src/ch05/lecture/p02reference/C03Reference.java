package ch05.lecture.p02reference;

public class C03Reference {

	public static void main(String[] args) {
		int a = 3;

		method1(a); //3
		System.out.println(a); //3
	}

	public static void method1(int b) {
		System.out.println(b); //30
		b = 30;
		System.out.println(b);
	}

}
