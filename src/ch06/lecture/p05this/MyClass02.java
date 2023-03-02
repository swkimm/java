package ch06.lecture.p05this;

public class MyClass02 {

	// instance field
	String name;
	
	// instance method
	void printName() {
		String name  = "park";
		System.out.println(name); // local variable
		System.out.println(this.name); // instance field
	}
	
	
	
	void setName(String name) {
		this.name = name;
	}
}


