package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
//		MyClass03<? super Number> o3 = new MyClass03<Integer>();
		
//		o1.item = new Number();  // 됨 (추상 클래스여서 인스턴스화 못함) 
		o1.item = new Integer(0);
//		o1.item = new Object(); // xx
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o6 = new MyClass03<Double>();
		Number n1 = o4.item;
		Object o5 = o4.item;
//		Integer i1 = o4.item;
	}
}

class MyClass03<T> {
	public T item;
}