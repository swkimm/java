package ch11.lecture.p04Throw;

public class C03Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}
