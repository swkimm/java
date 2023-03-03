package ch06.lecture.p10access;

import ch06.lecture.p10access.package1.*;

public class C02AccessModifier {
	public static void main(String[] args) {
		
		MyClass02 o1 = new MyClass02();
		
		System.out.println(o1.name);
//		System.out.println(o1.married); // default 접근제한자 접근 불가(같은 패키지 내에서만)
		
//		o1.method3();	// default 접근제한자 접근 불가(같은 패키지 내에서만)
		
		
	}
}
