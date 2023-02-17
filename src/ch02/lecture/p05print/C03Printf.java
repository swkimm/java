package ch02.lecture.p05print;

public class C03Printf {
	public static void main(String[] args) {
		// printf : 형식에 맞춰서 출력

		System.out.printf("어떤 형식");
		System.out.printf("또 다른 형식");
		System.out.println();


		// %n : 새로운 줄
		System.out.printf("new line%nnew line");
		System.out.println();
		// \n : 새로운 줄
		System.out.printf("new line\nnew line");
		System.out.println();
		
		// %d : 10진법 정수
		System.out.printf("10진법 정수 %d입니다.", 123);
		System.out.printf("%n10진법 정수 %8d입니다.", 123);
		System.out.printf("%n10진법 정수 %-8d입니다.", 123);
		System.out.printf("%n10진법 정수 %08d입니다.", 123);
		
		// %f : 10진법 실수
		System.out.printf("%n10진법 실수 %10.2f입니다.", 1113.234);
		System.out.printf("%n10진법 실수 %-10.2f입니다.", 1113.234);
		System.out.printf("%n10진법 실수 %010.2f입니다.", 1113.234);
		
		// %s : 문자열
		System.out.printf("%n문자열 %s임", "hello");
		System.out.printf("%n문자열 %6s임", "world");
		System.out.printf("%n문자열 %-9s임", "world");
		System.out.printf("%n문자열 %s임", 3.154);
		System.out.printf("%n문자열 %s임", 1234533);
		
		
		
	}
}
