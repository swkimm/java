package ch12.lecture.p06Annotation;

public class C09Annotation {

}

class MyClass09 {
	@MyAnnotation09(val1 = "h1", val2 = {"a", "b"})
	int f1;
	@MyAnnotation09(val1 = "h1", val2 = {"a"})
	int f2;
	@MyAnnotation09(val1 = "h1", val2 = "a")
	int f3;
}


@interface MyAnnotation09 {
	String val1();
	String[] val2();
	
}