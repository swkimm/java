package ch06.lecture.p07constructor;

public class C08Overloading {

	public static void main(String[] args) {
		
		MyClass08 o1 = new MyClass08("son", 33, "01-03", false);
		MyClass08 o2 = new MyClass08("lee", 23, null, false);
		o2.birthDate = "02-09";
		
		MyClass08 o3 = new MyClass08("cha", 22, false);
		o3.birthDate = "08-09";
	}
	
}
