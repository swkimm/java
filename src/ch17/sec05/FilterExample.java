package ch17.sec05;

import java.util.*;

public class FilterExample {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("신용권");
		list.add("신민철");

		list.stream()
				.distinct()
				.forEach(System.out::println);
		System.out.println();

		list.stream()
				.filter(n -> n.startsWith("신"))
				.forEach(System.out::println);
		System.out.println();

		list.stream()
				.distinct()
				.filter(n -> n.startsWith("신"))
				.forEach(System.out::println);

	}
}
