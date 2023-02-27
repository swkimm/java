package ch05.lecture.p06for;

public class C01EnhancedFor {
	public static void main(String[] args) {
		
		// 향상된 For문
		// 배열 전체 검색에 용이함
		
		// 기존에 사용하는 for
		int[] arr1 = {5,6,7,8,10,1,2};
		
		for(int i =0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		// 향상된 For문. foreach
		for(int n : arr1) {
			System.out.println(n);
		}
		
		
	}
}
