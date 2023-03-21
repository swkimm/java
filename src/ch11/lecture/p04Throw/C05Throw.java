package ch11.lecture.p04Throw;

public class C05Throw {
	public static void main(String[] args) {
		
	}
	
	public static void method2() throws Throwable {
		throw new ClassNotFoundException();
	}
	
	// 런타임예외로 throws 문 생략 가능  
	public static void method1() throws RuntimeException{
		throw new ClassCastException();
	}
}
