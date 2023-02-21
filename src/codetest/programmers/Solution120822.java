package codetest.programmers;

class Solution822 {
    public String solution(String my_string) {
    	
    	String answer = "";
    	for (int i = my_string.length()-1; i >= 0; i-- ) {
    		answer += my_string.charAt(i);
    	}
        
        return answer;
    }
}


public class Solution120822 {

	public static void main(String[] args) {

		Solution822 sol = new Solution822();
		String s = "kim";
		System.out.println(sol.solution(s));
		
	}

}
