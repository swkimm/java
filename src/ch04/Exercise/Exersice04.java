package ch04.Exercise;

public class Exersice04 {

	public static void main(String[] args) {

		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			int result = num1 + num2;
//			System.out.println("(" + num1 + "," + num2 + ")");
			if (result != 5) {
				System.out.println("(" + num1 + "," + num2 + ")");
			} else {
				System.out.println("(" + num1 + "," + num2 + ")");
				break;
			}

		}

	}

}
