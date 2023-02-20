package ch03.lecture.p06string;

public class C06ToLowerCase {

	public static void main(String[] args) {
		// toLowerCase
		// 소문자로 바꾼 문자열 리턴
		
		// toUpperCase
		// 대문자로 바꾼 문자열 리턴
		
		String str1 = "I'm IronMan";
		String res1 = str1.toLowerCase();
		System.out.println(res1);
		
		String res2 = str1.toUpperCase();
		System.out.println(res2);
		
		// 대소문자 구분없이 문자열 위치 확인
		String res3 = str1.toLowerCase();
		System.out.println(str1.indexOf("ir"));
		System.out.println(res3.indexOf("ir"));
		System.out.println(str1.toLowerCase().indexOf("ir")); // 메소드 체인 
		
		// 대소문자 구분없이 특정 문자열이 있는지 확인
		String str4 = "lorem ipSum";
		
		String res4 = str4.toLowerCase();
		System.out.println(res4.contains("sum"));
		System.out.println(res4.contains("sum"));
		
		System.out.println(str4.toUpperCase().contains("SUM"));
			
	}

}
