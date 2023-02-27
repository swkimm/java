package codetest.programmers;

import java.util.Arrays;

class Solution911 {
    public String solution(String my_string) {
    	String str = my_string.toLowerCase();
    	//split 사용해서 문자열에 저장가능 
    	char[] chars = str.toCharArray();
    	Arrays.sort(chars);
    	String answer = new String(chars);
    
        return answer ;
    }
}





public class Solution120911 {
	public static void main(String[] args) {
		
	}
}
