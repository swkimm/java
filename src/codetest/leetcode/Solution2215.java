package codetest.leetcode;

import java.util.*;

public class Solution2215 {
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<>();
		for (int n : nums1) {
			set1.add(n);
		}
		Set<Integer> set2 = new HashSet<>();
		for (int n : nums2) {
			set2.add(n);
		}

		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
//		List<Integer> result1 = new ArrayList<>();
//		List<Integer> result2 = new ArrayList<>();

		list1.addAll(set1);
		list2.addAll(set2);

		list1.removeAll(list2);
//		for (int n : list1) {
//			list1.add(n);
//		}
		list2.removeAll(set1);
//		for (int n : list2) {
//			list2.add(n);
//		}

		List result = List.of(list1, list2);

		return result;
	}

}
