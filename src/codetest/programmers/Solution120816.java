package codetest.programmers;

class Solution816 {
	public static int solution(int slice, int n) {
		int answer = 0;
		if (slice < n) {
			if ((n % slice) != 0) {
				answer = (n / slice) + 1;
			} else {
				return answer = n / slice;
			}
		} else {
			return answer = slice / slice;
		}
		return answer;
	}
}

public class Solution120816 {

	public static void main(String[] args) {
		System.out.println(Solution816.solution(12, 4));
	}

}
