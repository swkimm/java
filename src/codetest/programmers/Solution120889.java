package codetest.programmers;

import java.util.Arrays;

class Solution889 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
//        (sides[0] + sides[1]) > sides[2] ? answer = 1 : answer = 2; // 안
        if((sides[0] + sides[1]) > sides[2]) {
        	answer = 1;
        } else {
        	answer = 2;
        }
        return answer;
    }
}



public class Solution120889 {

	public static void main(String[] args) {

	}

}
