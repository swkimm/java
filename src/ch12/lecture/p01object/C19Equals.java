package ch12.lecture.p01object;

public class C19Equals {
	public static void main(String[] args) {
		Object o1 = new MyClass19();
		
	}
	
}


class MyClass19 {
	@Override
	public int hashCode() {
		return 33;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}