package codetest.programmers;

import java.util.Arrays;

class Solution847 {
    public int solution(int[] numbers) {
    	Arrays.sort(numbers);
    	int max = numbers[numbers.length-1];
    	int max2 = numbers[numbers.length-2];
        int answer = max * max2;
        
        return answer;
    }
}


public class Solution120847 {

	public static void main(String[] args) {
		Solution847 sol = new Solution847();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(sol.solution(arr));
	}

}
