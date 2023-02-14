package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x +  ", y: " + y);
		
		// 코드 작성
//		x = 5;
//		y = 3;
//		
		int temp = y;
		x = y;
		y = temp;
		
		System.out.println(x); // 5
		System.out.println(y); // 3
		System.out.println("x: " + x +  ", y: " + y);

	}
}
