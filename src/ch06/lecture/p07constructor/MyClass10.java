package ch06.lecture.p07constructor;

public class MyClass10 {

	String name;
	int age;
	String birthDate;
	boolean married;
	
	//1
	MyClass10(String name) {
		this.name = name;
	}
	//2
	MyClass10(String name, int age) {
		this(name); // 다른 생성자 호출 
//		this.name = name;
		this.age = age;
	}
	//3
	MyClass10(String name, int age, String birthDate) {
		this(name, age); // 다른 생성자 호출 (2번 호)
//		this.name = name;
//		this.age = age;
		this.birthDate = birthDate;
	}
	
	void printField() {
		System.out.println("name : " + name + ", age : " + age + ", birthDate : " + birthDate);
	}
	
}
