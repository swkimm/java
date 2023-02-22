package ch05.lecture.p03matrix;

public class C02Matrix {

	public static void main(String[] args) {
		
		int[][] mat = new int[3][4];
		
		System.out.println(mat.length);
		System.out.println(mat[0].length);
		System.out.println(mat[1].length);
		System.out.println(mat[2].length);

		System.out.println("전체 탐색");
		
		for (int i =0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
