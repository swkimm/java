package ch04.Exercise;

public class TwoForExercise {

	public static void main(String[] args) {

//		문제1)
//		0
//		01
//		012
//		0123
//		01234
			
		for (int i =0; i < 5; i++) {
			for(int j=0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	
//		문제2
//		1
//		12
//		123
//		1234
//		12345
//		
		for (int i =0; i <= 5; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
//		문제3
//		0
//		10
//		210
//		3210
//		43210
		
		
		for (int i =0; i <= 5; i++) {
			for(int j=i; j > 0; j--) {
				System.out.print(j-1);
			}
			System.out.println();
		}
		
	}

}
