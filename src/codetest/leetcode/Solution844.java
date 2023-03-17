package codetest.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {

		String res1 = "";
		String res2 = "";
		Stack<String> st1 = new Stack<String>();
		Stack<String> st2 = new Stack<String>();

		for (int i = 0; i < s.length(); i++) {
			String str1 = String.valueOf(s.charAt(i));
			if (!str1.equals("#")) {
				st1.push(str1);
			} else {
				st1.pop();
			}
		}
		for (int i = 0; i < t.length(); i++) {
			String str2 = String.valueOf(t.charAt(i));
			if (!str2.equals("#")) {
				st2.push(str2);
			} else {
				st2.pop();
			}
		}
		while (!st1.isEmpty()) {
			res1 += st1.pop();
		}
		while (!st2.isEmpty()) {
			res2 += st2.pop();
		}

		return res1.equals(res2);

	}
}
