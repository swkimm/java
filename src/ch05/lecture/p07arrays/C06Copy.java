package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C06Copy {
	public static void main(String[] args) {
		// 참조 타입은 참조값으로 연결됨
		// 2차원 배열의 경우, 인덱스 n번째는 참조값으로 연결됨(주소값을 가짐)
		// 배열 복사 후 원본 배열에 값 수정하면 같이 변경됨 
		// 기본타입으로 저장된 1차원 배열은 배열을 복사 후 배열 수정하면 원본 배열 값만 수정됨
		
		
		// 얕은 복사(shallow copy) 
		int[][] arr1 = {
				{ 3, 4 },
				{ 9, 8 }
		};
		
		int[][] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		
		arr1[0][0] = 30;
	}
}
