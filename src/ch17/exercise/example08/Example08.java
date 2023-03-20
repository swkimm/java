package ch17.exercise.example08;

import java.util.*;

public class Example08 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");

		list.stream()
//		.map(String::toLowerCase)
				.filter(s -> s.toLowerCase().contains("java"))
//		.filter(s-> s.contains("Java"))
				.forEach(System.out::println);

		list.stream()
				.filter(Example08::havingJava)
				.forEach(System.out::println);

	}

	private static boolean havingJava(String s) {
		return s.toLowerCase().contains("java");
	}
}
