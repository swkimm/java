package ch17.lecture.p03intermediate;

import java.util.*;

public class C03Distintct {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(3,1,2,0,1,2,3);
		
		long count = list.stream()
				.count();
		
		System.out.println(count);
		
		long count2 = list.stream()
				.distinct()
				.count();
		
		System.out.println(count2);
	}
}
