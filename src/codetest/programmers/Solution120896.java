package codetest.programmers;

import java.util.*;
import java.util.Map.*;

class Solution0896 {
	public String solution(String s) {
		String answer = "";
		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			String str = String.valueOf(s.charAt(i));
			list.add(str);
		}
		Map<String, Integer> map = new HashMap<>();

		for (String str1 : list) {
			if (map.containsKey(str1)) {
				int oldValue = map.get(str1);
				map.put(str1, oldValue + 1);
        	} else {
        		map.put(str1, 1);
			}
		}
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		List<String> list2 = new ArrayList<>();
		for(var entry : entries) {
			int count = 0;
			if( entry.getValue() == 1) {
				answer += entry.getKey();
			}
		}
		char res[] = null;
		for(int i =0; i < answer.length(); i++) {			
			res = answer.toCharArray();
		}
		Arrays.sort(res);
		
		return new String(res);
	}
}

public class Solution120896 {
	public static void main(String[] args) {
		Solution0896 sol = new Solution0896();
		String result = sol.solution("abcabcadc");
		System.out.println(result);
		
	}
}
