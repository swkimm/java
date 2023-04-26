package codetest.programmers;

import java.util.*;

//class Solution850 {
//	public int[] solution(String my_string) {
//		
//		String regex = "^[0-9]*$";
//		String str = my_string.replaceAll(regex, "");
//		str.trim();
//		String str1 = "";
//		
//		for(int i =0; i< str.length(); i++ ) {
//			str1 += str.charAt(i);
//		}
//		
//		int[] sol = new int[str.length()];
//		int j = 0;
//		
//		for(int i =0; i < str.length(); i++) {
//			sol[i] += Integer.parseInt(str1[i];
//			}
//		Arrays.sort(sol);
//		return sol;
//		}
//}

public class Solution120850 {
	public static void main(String[] args) {
		
		
		String regex1 = "^[0-9]*$";
		String str = "hi125987";
//		str.replaceAll(regex," ");
		System.out.println(str.replaceAll(" ","^[a-zA-Z]*$"));
		
	}
}
