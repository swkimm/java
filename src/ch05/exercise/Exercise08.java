package ch05.exercise;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		int total = 0;
		int totalNum = 0;

		for (int i = 0; i < array.length; i++) {
			totalNum += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
		}
		System.out.println("전체 합 : " + total);
		double avg = (double) total / totalNum;
		System.out.println("전체 평균 : " + avg);
	}

}
