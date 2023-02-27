package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {

	public static void main(String[] args) {
		int[] arr1 = { 9, 8, 7, 1, 2 };

		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
	
		String[] arr2 = {"java", "Spring", "react", "javaScript", "JSP" };
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr2);	 // 주소 값 출력 
	
	}

}
