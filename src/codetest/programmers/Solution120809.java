package codetest.programmers;

public class Solution120809 {

	public static void main(String[] args) {

		Solution s = new Solution();
		int[] arr = {1,2,3,4,5};
//		s.solution(new int[] {1,2,3,4,5});
		int[] result = s.solution(arr);
		
		for (int i = 0; i < 5; i++) {
			System.out.print(result[i] + " ");
		}

	}

}

class Solution {

	public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
        	answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}
