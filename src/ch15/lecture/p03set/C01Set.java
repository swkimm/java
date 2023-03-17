package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		
		// set : 순서 없음, 중복 안됨 
		Set<Integer> set = new HashSet<>();
		
		// add element
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(30);
	
		// size 크기 
		int size = set.size();
		System.out.println(size);
		// toString 
		System.out.println(set);
		
		// remove
		set.remove(3);
		System.out.println(set.size());
		// toString 
		System.out.println(set);

		// 전체탐색 
		System.out.println("향상된 for");
		for(Integer e : set) {
			System.out.println(e);
		}
		
		System.out.println("Iterator");
		Iterator<Integer> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("forEach");
		set.forEach(e -> System.out.println(e));
		
		System.out.println("forEach");
		set.forEach(System.out::println);
		
	}
	
}
