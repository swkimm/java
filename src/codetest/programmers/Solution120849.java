package codetest.programmers;

//문제 설명
//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다. 
//문자열 my_string이 매개변수로 주어질 때 
//모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

class Solution849 {
    public String solution(String my_string) {
//        String answer = "";
//        1. 정규 표현식 사용 
        
        return my_string.replaceAll("[aeiou]", " ");
        
        
        
        
//        2. for문 사용 
//        for(int i = 0; i< my_string.length(); i++) {
//        	char c = my_string.charAt(i);
//        	switch (c) {
//        	case 'a','e','i','o','u' :
//        		break;
//        	default : 
//        		answer += c;
//        	}
//        }
//        return answer;
    }
}


public class Solution120849 {
	public static void main(String[] args) {
		
	}
}
