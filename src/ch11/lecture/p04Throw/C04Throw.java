package ch11.lecture.p04Throw;

public class C04Throw {
	public static void main(String[] args) {
		
		try {
			
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
								// 생략 가능 
	public static void method1() throws RuntimeException {
		throw new RuntimeException();
	}
}
