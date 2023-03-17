package codetest.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {

//		Map<Integer, Integer> map = new HashMap<>();
//
//		for (int n : nums) {
//			map.putIfAbsent(n, 0);
//			int oldValue = map.get(n);
//			map.replace(n, oldValue + 1);
//		}
//
//		int sum = 0;
//
//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			int value = entry.getValue();
//			if (value == 1) {
//				sum += entry.getValue();
//			}
//		}
//
//		return sum;

		Set<Integer> set = new HashSet<>();
		int sum = 0;

		for (int n : nums) {
			if (set.contains(n)) {
				set.remove(n);
			} else {
				set.add(n);
			}
		}
		for (int n : set) {
			sum += n;
		}
		if (set.size() == 1) {
			sum = 0;
			return sum;
		} else if (nums.length == 1) {
			sum = nums[0];
			return sum;
		}

		return sum;
	}

}
