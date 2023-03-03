package ch06.lecture.p11capsule;

public class MyClass03 {

	private String name;
	private int age;
	private String address;
	private boolean married;
	
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	// boolean 타입의 getter 는 is 로 시작 
	public boolean isMarried() {
		return this.married;
	}

	// 메소드 통해서 필드에 접근하도록
	// 필드 변경하려면 set필드명
	public void setName(String name) {
		this.name = name;
	}

	// 필드 읽으려면 get필드명
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setAddress() {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}
}
