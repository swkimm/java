package ch06.sec08.exam01;

public class C04Parameter {

	public static void main(String[] args) {
		
		MyClass04 o1 = new MyClass04();		
		o1.method1();
		
		// 메소드 실행시 정의된 파라미터 타입과 순서, 개수에 맞춰서 
		// 아규먼트 입력 
//		o1.method1(3);
		
		o1.method2(5);
//		o1.method2(); // 안됨 
		
		o1.method3("java");
		
		String s1 = "hello";
		
		o1.method3(s1);
		
		o1.method3(null);
		
		o1.method4(0, 0);
		o1.method5(s1, s1);
		o1.method6(0, s1);
		o1.method7(s1, 0);
	
	
	
	
	
	}
}
