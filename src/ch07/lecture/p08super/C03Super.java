package ch07.lecture.p08super;

public class C03Super {
	public static void main(String[] args) {
		
		Sub03 s = new Sub03();
		System.out.println(s);
		
		
	}
}

class Super03 {
	Super03(int i) {
		System.out.println("생성자 실행됨" + i);
	}
}
class Sub03 extends Super03 {
	Sub03() {
		// 자동으로 삽입되는 상위클래스 기본 생성자 호출 코드는 동작하지 않음  
		
		super(10); 
		System.out.println("하위 클래스 생성자 실행됨");
	}
}
