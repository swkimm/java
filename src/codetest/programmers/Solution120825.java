package codetest.programmers;

class Solution825 {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for ( int i =0; i < my_string.length(); i++) {
        	for( int j = 0; j < n; j++) {        		
        		answer += String.valueOf(my_string.charAt(i));
        	}
        }
        return answer;
    }
}




public class Solution120825 {

	public static void main(String[] args) {

		Solution825 sol = new Solution825();
		
		System.out.println(sol.solution("hello", 3));
		
	}

}
