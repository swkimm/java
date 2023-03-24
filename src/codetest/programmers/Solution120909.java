package codetest.programmers;

class Solution0909 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i =1; i <= n; i++) {
        	if(i * i == n) {
        		answer = 1;
        		break;
        	} else {
        		answer = 2;
        	}
        }
        return answer;
    }
}



public class Solution120909 {
	public static void main(String[] args) {
		
		Solution0909 sol = new Solution0909();
		int result = sol.solution(144);		
		System.out.println(result);
	}
}
