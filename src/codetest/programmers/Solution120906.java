package codetest.programmers;

class Solution0906 {
	public int solution(int n) {
		int answer = 0;
		String[] str = String.valueOf(n).split("");

		for (int i = 0; i < str.length; i++) {
			answer += Integer.parseInt(str[i]);
		}
		return answer;
	}
}

public class Solution120906 {

	public static void main(String[] args) {

		Solution0906 sol = new Solution0906();
		System.out.println(sol.solution(1234));
		System.out.println(String.valueOf(12345));
	}
}
