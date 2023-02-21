package ch04.lecture.p01if;

public class C01If {

	public static void main(String[] args) {

		System.out.println("이전 실행문");

		if (false) {
			System.out.println("실행문1");
		}
		System.out.println("실행문2");

		// if 코드 블럭의 명령문이 하나면 {} 생략 가능

		if (false)
			System.out.println("실행문3");

		System.out.println("실행문4");

	}

}
