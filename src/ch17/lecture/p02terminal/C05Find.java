package ch17.lecture.p02terminal;

import java.util.*;

public class C05Find {
	public static void main(String[] args) {
		// findFirst
		// findAny

		// Optional<T>
		Optional<String> o1 = Optional.of("java");
		System.out.println(o1.isPresent());
		System.out.println(o1.isEmpty());

		String s1 = o1.get();
		String s2 = o1.orElse("default");
		System.out.println(s2);
		
		System.out.println();
		Optional<String> o2 = Optional.ofNullable(null);
		System.out.println(o2.isPresent());
		
	}
}
