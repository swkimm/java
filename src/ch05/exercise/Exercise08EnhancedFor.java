package ch05.exercise;

public class Exercise08EnhancedFor {

	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		int sum = 0;
		int cnt = 0;
		double avg = 0.0;

		for (int[] num : array) {
			for (int i : num) {
				sum += i;
				cnt++;
			}
		}
		avg = (double)sum / cnt;
		System.out.println("총합 " + sum);
		System.out.println("총인원 " + cnt);
		System.out.println("평균 " + avg);
	
	}

}
 