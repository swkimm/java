package ch06.lecture.p07constructor;

public class MyClass03 {
	String name;
	int age;
	
	MyClass03 () {
		name = "son";
		age = 99;
	}
	
	
	void descript() {
		System.out.println("이름은 " + name + "이고 나이는 " + age);
	}
}
