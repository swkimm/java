package codetest.programmers;

import java.util.Arrays;

class Solution813 {
	public int[] solution(int n) {
		int num = 0;
		if (n % 2 == 0) {
			num = n / 2;
		} else {
			num = (n / 2) + 1;
		}
		int[] answer = new int[num];
		int nu = 0;
		for (int i = 0; i < n+1; i++) {
			if (i % 2 != 0) {
				answer[nu++] += i;
			}
		}
		return answer;
	}
}

public class Solution120813 {

	public static void main(String[] args) {

		Solution813 sol = new Solution813();
		System.out.println(Arrays.toString(sol.solution(15)));
	}

}
