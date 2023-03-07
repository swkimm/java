package ch07.exercise.example06;

public class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(""); // 부모 클래스 상속자형태 추가 
		this.name = name;
		this.studentNo = studentNo;
	}
}
