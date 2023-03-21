package codetest.programmers;

import java.util.*;
import java.util.Map.*;

class Solution0812 {
	public int solution(int[] array) {
		int answer = 0;
		int min = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i : array) {
			if (map.containsKey(i)) {
				int oldValue = map.get(i);
				map.put(i, oldValue + 1);
			} else {
				map.put(i, 1);
			}
		}
		
		Set<Entry<Integer, Integer>> entries = map.entrySet();

		for (Entry<Integer, Integer> entry : entries) {
			if (entry.getValue() > min) {
				answer = entry.getKey();
				min = entry.getValue();
			} else if (min == entry.getValue()) {
				answer = -1;
			}
		}
		return answer;

	}
}

public class Solution120812 {
	public static void main(String[] args) {
		Solution0812 sol = new Solution0812();
		int arr[] = { 1, 2, 3, 3, 3, 4 };
		int arr1[] = { 1, 1, 2, 2 };
		int res = sol.solution(arr);
		System.out.println(res);
		int res1 = sol.solution(arr1);
		System.out.println(res1);
	}
}
