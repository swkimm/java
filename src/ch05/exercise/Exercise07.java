package ch05.exercise;

import java.util.Arrays;

public class Exercise07 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max =0;
//		Arrays.sort(array);
		for(int i =0; i< array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);
	}

}
