package ch17.exercise.example07;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {

		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		for (Member m : list) {
			if (m.getJob() == "개발자") {
				System.out.println(m.getName());
			}
		}
		System.out.println();

		list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.map(Member::getName)
				.forEach(System.out::println);
		System.out.println();

		List<Member> developers = list.stream()
				.filter(s -> s.getJob().equals("개발자"))
				.collect(Collectors.toList());

		developers.stream()
				.forEach(m -> System.out.println(m.getName()));
		System.out.println();
	}
}
