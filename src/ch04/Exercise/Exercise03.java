package ch04.Exercise;

public class Exercise03 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		while (i <= 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터 100까지의 3의 배수의 합은 : " + sum);
	}

}
