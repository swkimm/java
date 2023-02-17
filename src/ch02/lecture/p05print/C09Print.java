package ch02.lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		// width 출력할 때 차지할 문자칸 수
		System.out.printf("%d%n", 300);
		System.out.printf("%5d%n", 300);
		System.out.printf("%-5d%n", 300);
		System.out.printf("%05d%n", 300);
		
		int age = 33;
		String name = "son";
		
		System.out.printf("나이는 %2$3d이고, 이름은 %1$10s입니다.%n", name, age );
		
	}
}
