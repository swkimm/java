package codetest.programmers;

import java.util.*;

class Solution895_2 {
	public String solution(String my_string, int num1, int num2) {
		String[] answer = my_string.split("");
		String find = answer[num1];
		answer[num1] = answer[num2];
		answer[num2] = find;
		
		return String.join("", answer);
	}
}

class Solution895{
	public String solution(String my_string, int num1, int num2) {
        String[] answer = new String[my_string.length()];
        String[] str = my_string.split("");

        int j = 0;
        for(int i = 0; i < my_string.length(); i++) {
        	if(i == num1) {
        		answer[j] = str[num2];
        		j++;
        	} else if(i ==num2) {
        		answer[j] = str[num1];
        		j++;
        	} else {
        		answer[j] = str[i];
        		j++;
        	}
        }
        return String.join("", answer);
    }
}

public class Solution120895 {
	public static void main(String[] args) {
		Solution895_2 sol = new Solution895_2();
		System.out.println(sol.solution("hello", 1,2));
	}
}
