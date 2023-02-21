package codetest.programmers;

public class Solution120585 {                                                   

	public static void main(String[] args) {

		Solution585 sol = new Solution585();
		int[] arr = { 149, 180, 192, 170 };
		int res = sol.solution(arr, 167);
		System.out.println(res);

	}
}

class Solution585 {
	public int solution(int[] array, int height) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > height) {
				answer += 1;
//				return answer;
			}
		}
		return answer;

	}
}