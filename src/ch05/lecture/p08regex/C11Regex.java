package ch05.lecture.p08regex;

public class C11Regex {
	public static void main(String[] args) {
		// 010으로 시작하고, - 기호, 숫자 4개, - 기호, 숫자 4개
		
		String pat = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
		System.out.println("010-1234-1234".matches(pat)); //true
		System.out.println("010-124-1234".matches(pat)); //false
		System.out.println("010-34-1234".matches(pat)); //false
		System.out.println("0101234-1234".matches(pat)); //false
		System.out.println("010-123-31234".matches(pat)); //false
		System.out.println("010-12334-1234".matches(pat)); //false
	}
}
