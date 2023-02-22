package codetest.programmers;

import java.util.Arrays;

class Solution833 {
    public int[] solution(int[] numbers, int num1, int num2) {
    	
    	int[] answer = new int[num2];
    	int a = 0;
        for (int i =num1; i<=num2; i++ ) {
        	answer[a++] = numbers[i];
        } 
        return answer;
    }
}








public class Solution120833 {

	public static void main(String[] args) {
		Solution833 sol = new Solution833();
		int[] arr = {1,3,5};
		
		System.out.println(Arrays.toString(sol.solution(arr, 1, 2)));
	}

}
