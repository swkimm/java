package ch05.lecture.p08regex;

public class C13Regex {

	public static void main(String[] args) {
		
		// 3 이상 : {3,}
		
		String pattern = "[0-9]{2,}";
		
		System.out.println("09".matches(pattern));
		System.out.println("123".matches(pattern));
		System.out.println("2".matches(pattern));
		System.out.println("2a".matches(pattern));
		
		
	}
	
}
