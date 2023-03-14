package ch16.lecture.p03reference;

public class C04MethodReference {
	public static void main(String[] args) {
		// instance method 
		// Reference to an instance method
		// of an arbitrary object of a particular type
		MyInterface05 o1 = (a, b) -> a.method(b);
		MyInterface05 o2 = MyClass04::method;
	}
}

interface MyInterface05 {
	void action(MyClass04 a, int b);
}

class MyClass04 {
	void method(int a) {
		
	}
}
