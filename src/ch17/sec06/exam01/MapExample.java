package ch17.sec06.exam01;

import java.util.*;
import java.util.stream.*;

public class MapExample {
	public static void main(String[] args) {

		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 82));

		studentList.stream()
				.mapToInt(s -> s.getScore())
				.forEach(score -> System.out.println(score));

		int max = studentList.stream()
				.mapToInt(Student::getScore)
				.max()
				.getAsInt();
		
		System.out.println(max);
		
		int min = studentList.stream()
				.mapToInt(Student::getScore)
				.min()
				.getAsInt();
		
		System.out.println(min);
		
		
		int sum = studentList.stream()
				.mapToInt(Student::getScore)
				.sum();
		
		System.out.println(sum);
		
		
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
		
		
		// 통계 
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		
		System.out.println("최대 : " + summary.getMax());
		System.out.println("최소 : " + summary.getMin());
		System.out.println("합계 : " + summary.getSum());
		System.out.println("평균 : " + summary.getAverage());

		
		
		
		
	}
}
