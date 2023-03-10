package ch12.exercise.example08;

public class Example08 {
	public static void main(String[] args) {
		
	int[] scores = new int[1000];
	long time1 = System.nanoTime();
	for(int i =0; i<scores.length; i++) {
		scores[i] = i;
		
		int sum =0;
		for(int score : scores ) {
			sum += score;
		}
		
		double avg = sum/scores.length;
		System.out.println(avg);
		long time2 = System.nanoTime();
		System.out.println(time2-time1);
	}
	
	}
}
