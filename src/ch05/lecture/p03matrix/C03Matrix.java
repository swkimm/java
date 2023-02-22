package ch05.lecture.p03matrix;

public class C03Matrix {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 2, 3, 4, 5 };

		int[][] mat1 = new int[][] {
				new int[] { 3, 4, 5, 6 },
				new int[] { 1, 2, 3, 4 },
				new int[] { 7, 8, 9, 1 }
		};

		int[] arr2 = { 2, 3, 4, 5 };
		int[][] mar2 = {
				{ 3, 4, 5, 6 },
				{ 10, 11, 12, 13 },
				{ 9, 8, 7, 6 }
		};

		int[][] mat3 = {
				{ 1, 2, 3, 4 },
				{ 1, 1 },
				{ 9, 1, 1 }
		};

		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3[i].length; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
