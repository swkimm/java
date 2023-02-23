package codetest.baekjun;

import java.util.Scanner;

//문제
//문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.

public class Problem9086 {

	public static void main(String[] args) {

		int cnt = 0;
		char str1;
		char str2;
		String str3 = "";
		int len = 0;
		String input = """
				3
				ACDKJFOWIEGHE
				O
				AB""";
		Scanner scan = new Scanner(input);
		cnt = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < cnt; i++) {
			String input1 = scan.nextLine();
			len = input1.length();
			str1 = input1.charAt(0);  
			str2 = input1.charAt(len-1);  
			System.out.println("" + str1 + str2);
//			System.out.println(str3);
		}

	}

}
