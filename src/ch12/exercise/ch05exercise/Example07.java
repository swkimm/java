package ch12.exercise.ch05exercise;

public class Example07 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = 0;

		for (int i: array) {
			max = Math.max(max, i);
			}
		
		System.out.println(max);
		}
	
}
