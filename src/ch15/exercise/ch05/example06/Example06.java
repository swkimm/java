package ch15.exercise.ch05.example06;

import java.util.*;

public class Example06 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		List<List<Integer>> list = List.of(
				List.of(95, 86),
				List.of(83, 92, 96),
				List.of(78, 83, 93, 87, 88));

		// 문제6
		System.out.println(list.size()); // ?
		System.out.println(list.get(2).size()); // ?

		// 문제 8
		// 합, 평균 구하기
		int i = 0;
		int sum = 0;
		int cnt =0;
	
		for (List<Integer> first : list) {
			for (Integer sec : first) {
				sum += sec;
				cnt++;
			}
		}
		System.out.println("합" + sum);
		
//		for(int j = 0; j<= list.size(); i++ ) {
//			size += list.get(i).size();
//		}
		System.out.println("평균" + sum/cnt);
	}
}
