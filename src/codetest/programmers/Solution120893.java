package codetest.programmers;


class Solution0893 {
	public String solution(String my_string) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i =0; i< str.length; i++) {
            if(str[i].matches("[a-z]")) {
                answer += str[i].toUpperCase();
            } else if(str[i].matches("[A-Z]")) {
                answer += str[i].toLowerCase();
            }
        }
        return answer;
    }
}


public class Solution120893 {

}
