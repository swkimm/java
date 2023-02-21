package ch04.Exercise;

public class Exercise04_WhileBreak {

	public static void main(String[] args) {
		
		
		while(true) {
			int num1 = (int)(Math.random() * 6 ) +1;
			int num2 = (int)(Math.random() * 6 ) +1;
			System.out.printf("(%d, %d)%n", num1, num2 );
			if ((num1 + num2) ==5 ) {
				break;
			}
		}
	}

}
