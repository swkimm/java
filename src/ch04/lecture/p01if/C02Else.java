package ch04.lecture.p01if;

public class C02Else {

	public static void main(String[] args) {
		// else
		// if의 조건이 false일 경우 실행되는 블럭

		System.out.println("코드 실행 1");

		if (false) {
			System.out.println("코드 실행 2");
			System.out.println("코드 실행 3");
		} else {
			System.out.println("코드 실행 4");
			System.out.println("코드 실행 5");
		}
		
		System.out.println("실행 흐름 ...~~~~");
	
		if (false) {
			System.out.println("코드 실행 6");
		} else
			System.out.println("코드 실행 7");
		System.out.println("코드 계속 실행");
		
		
	
	
	}

}
