package codetest.programmers;

import java.util.Arrays;

class Solution824 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		int cntE = 0;
		int cntO = 0;

		for (int i = 0; i < num_list.length; i++) {
			switch (num_list[i] % 2) {
			case 0:
				cntE += 1;
				answer[0] = cntE;
				break;
			case 1:
				cntO += 1;
				answer[1] = cntO;
				break;
			default:
				break;

			}

//			if ( num_list[i] % 2 == 0 ) {
//				cntE += 1;
//				answer[0] = cntE;
//			} else {
//				cntO += 1;
//				answer[1] = cntO;
//			}
		}
		return answer;
	}
}

public class Solution120824 {

	public static void main(String[] args) {
		Solution824 sol = new Solution824();
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(sol.solution(arr)));
	}

}
