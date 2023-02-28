package ch05.lecture.p08regex;

public class C24Regex {
	public static void main(String[] args) {
		
	// 한글
	
	// 영문 소문자 [a-z]
	// 영문 대문자 [A-Z]
	// 한글 [가-힣]
	
	String pattern1 = "[가-힣]";
	
	System.out.println("산".matches(pattern1));
	System.out.println("a".matches(pattern1));
	System.out.println("3".matches(pattern1));
	
	
	// 한글 두글자 이상 공백 없이
	String pattern2 = "[가-힣]{2}";
	System.out.println("두산".matches(pattern2));
	System.out.println("산".matches(pattern2));
	System.out.println("백두산".matches(pattern2));
	
	}
}
