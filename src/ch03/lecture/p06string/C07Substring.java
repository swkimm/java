package ch03.lecture.p06string;

public class C07Substring {

	public static void main(String[] args) {
		// substring
		// 문자열의 일부(substring)을 리턴
		// return type : String
		
		String str1 = "회원님의 설정과 일치하는 서울의 새 채용공고: 1";
		// 첫번째 파라미터 : 시작 index(포함)
		// 두번째 파라미터 : 종료 index(포함안됨)
		String res1 = str1.substring(0, 2);
		System.out.println(res1+res1+res1);
		
		System.out.println(str1.substring(5, 7));
		
		System.out.println(str1.substring(9, str1.length()));
		
		// 파라미터 하나 : 시작 ~ 끝
		System.out.println(str1.substring(5));
	}

}
