package ch16.lecture.p03reference;

public class C05MethodReference {
	public static void main(String[] args) {
	
		MyInterface06 o0 = (MyInterface06) new MyClass06(){
			void action(MyClass06 o) {
				System.out.println("재정의한 메소드");
			}
		};
		
		MyInterface06 o01 = new MyInterface06() {
			@Override
			public void action(MyClass06 o) {
				System.out.println("재정의한 메소드2");
			}
		};
		
		MyInterface06 o02 = (MyClass06 o) -> System.out.println("재정의한 메소드2"); 
		MyInterface06 o03 = (o) -> System.out.println("재정의한 메소드2"); 
		
		MyInterface06 o1 = (x) -> x.someMethod();
		MyInterface06 o2 = MyClass06 :: someMethod;
	}
}

interface MyInterface06 {
	void action(MyClass06 o);
}

class MyClass06 {
	void someMethod() {
		
	}
}