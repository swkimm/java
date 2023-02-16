package ch02.lecture.p02type;

public class C14String {
	public static void main(String[] args) {
		String s1 = "helloe";
		String s2 = "h";
//		char c1 = (char) s2; 	// 참조타입과 기본타입간 형변환 안됨 
		String s3 = "";
		
		// 문자열(String)과 기본 타입간 형변환
		// 문자열 -> 기본타입(65P. 표 참조)
		String str1 = "300";
		int i1 = Integer.parseInt(str1);
		System.out.println(i1 + 300);
		
		String str2 = "90000000000000000";
		long l2 = Long.parseLong(str2);
		System.out.println(l2);
		
		String str3 = "3.14";
		double d3 = Double.parseDouble(str3);
		System.out.println(d3);
		
		String str4 = "9.988";
		float f4 = Float.parseFloat(str4);
		System.out.println(f4);
		
		String str5 = "true";
		boolean boo = Boolean.parseBoolean(str5);
		System.out.println(boo);
		
		
		// 기본타입 -> 문자열(String)
		// valueOf 메소드 사용
		int i6 = 700;
		String str6 = String.valueOf(i6);
		System.out.println(str6);
		
		long l7 = 9999999999L;
		String str7 = String.valueOf(l7);
		System.out.println(str7);
		
		double d8 = 3.14;
		String str8 = String.valueOf(d8);
		System.out.println(str8);
	}
}
