package ch02.lecture.p02type;

public class C15String {
	public static void main(String[] args) {
		// String과 기본 타입과의 연산
		// +외에 안됨
		String s1 = "3";
		String s2 = "4";
//		System.out.println(s1 * s2); // 오류
		
		// + : 연결연산(concatenate)
		int i3 = 3;
		String s3 = "4";
//		int i4 = i3 + s3; // x , 연산 결과가 String
		String s4 = i3 + s3;  // 연산 결과가 String
		System.out.println(s4);
		System.out.println(3.14 + "Hello");
		System.out.println(false + "ji");
		
		String r4 = 3 + 3 + "4";
		System.out.println(s4);
		
		String r5 = "3" + 3 + 4;
		System.out.println(r5);
		
		// 기본타입 => 스트링
		// valueOf 
		// 빈문자열과 연결 연산
		int i6 = 99;
		String s6 = String.valueOf(i6);
		String s7 = 99 + "";
		
		boolean b8 = false;
		String s8 = String.valueOf(b8);
		String s9 = b8 + "";
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s8);
		
	}
}
