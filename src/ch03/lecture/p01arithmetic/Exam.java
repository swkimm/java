package ch03.lecture.p01arithmetic;

public class Exam {

	public static void main(String[] args) {
		// 3.

		int pencils = 534;
		int students = 30;

		// 학생 한 명이 가지는 연필의 수
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);

		// 남은 연필 수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

		// 4.
		int value = 356;
		System.out.println(value - (value % 100));

		// 5. -4
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthTop + lengthBottom) * height / 2.0;
		double area2 = (lengthTop + lengthBottom) * height * 1.0 / 2;
		double area3 = (double) (lengthTop + lengthBottom) * height / 2;
		double area4 = (double) ((lengthTop + lengthBottom) * height / 2);

		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);

		// 7.
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과 : " + result);

		}

	}

}
