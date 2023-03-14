package ch15.exercise.example0507;

import java.util.*;

public class Exam0507 {
	public static void main(String[] args) {
//		int[] array = {1,5,3,8,2};
//		List<Integer> list = List.of(1,5,3,8,2);
		
		// of : 수정 불가 리스트 리턴 
		List<Integer> list = List.of(1,5,3,8,2);
		
		// 위 리스트에서 최대값 구하는 코드 작성
		int max = Integer.MIN_VALUE;
		
		for(Integer e : list) {
			max = Math.max(max, e);
		}
//		
//		for (int i = 0; i < list.size(); i++) {
//		    int number = list.get(i);
//		    if (max < number) {
//		        max = number;
		    
			System.out.println("Max: " + max);
		}
		
	}

