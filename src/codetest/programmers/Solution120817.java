package codetest.programmers;

public class Solution120817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Solution2 {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for (int i = 0; i < numbers.length; i++) {
        	answer += numbers[i]; 
        }
        return answer/ numbers.length;
    } 
}