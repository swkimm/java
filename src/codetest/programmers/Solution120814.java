package codetest.programmers;

class Solution814 {
    public int solution(int n) { // 사람 수 
        int answer = (n + 6) / 7;
        return answer;
    }
}


public class Solution120814 {
	public static void main(String[] args) {

		Solution814 sol = new Solution814();
		System.out.println(sol.solution(15));
		System.out.println(sol.solution(1));
		System.out.println(sol.solution(7));
		
	}

}
