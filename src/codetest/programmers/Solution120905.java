package codetest.programmers;

import java.util.*;

class Solution905 {
	public int[] solution(int n, int[] numlist) {
		List list = new ArrayList();
		for(int i : numlist) {
			if(i%n == 0) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i] = (int) list.get(i);
		}
		return answer;
	}
}

public class Solution120905 {
	public static void main(String[] args) {
		
	}
}
