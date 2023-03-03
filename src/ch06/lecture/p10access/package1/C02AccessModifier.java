package ch06.lecture.p10access.package1;

public class C02AccessModifier {
	public static void main(String[] args) {
	
		MyClass02 o1 = new MyClass02();
		
		System.out.println(o1.name);
//		System.out.println(o1.age); // private 접근제한자로 같은 클래스 내에서
		System.out.println(o1.married);
		
		
		o1.method1();
//		o1.method2();  // private 접근제한자로 같은 클래스 내에서
		o1.method3();
		
	}
}
