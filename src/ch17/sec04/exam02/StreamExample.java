package ch17.sec04.exam02;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
	public static void main(String[] args) {

		String[] strArray = { "홍길동", "신용권", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(s -> System.out.print(s + ","));
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(s -> System.out.print(s + ","));
		System.out.println();

	}
}
