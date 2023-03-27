package ch12.lecture.p06Annotation;

import java.lang.annotation.*;

public class C03Annotation {
	
}

@MyAnnotation03
class MyClass03 {
	@MyAnnotation03
	String field;
	
	@MyAnnotation03
	MyClass03() {
		
	}
	
	@MyAnnotation03
	void method1() {
		
	}
}

//@Target(ElementType.FIELD) // 필드  
//@Target(ElementType.METHOD) // 메소드  
//@Target(ElementType.TYPE) // 클래스와 인터페이스 
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}