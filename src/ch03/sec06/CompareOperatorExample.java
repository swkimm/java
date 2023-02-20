package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		boolean r1 = (num1 == num2);
		boolean r2 = (num1 != num2);
		boolean r3 = (num1 <= num2);
		System.out.println("r1 : " + r1); // true
		System.out.println("r2 : " + r2); // false
		System.out.println("r3 : " + r3); // true
		
		char c1 = 'A';
		char c2 = 'B';
		boolean r4 = (c1 < c2);
		System.out.println("r4 : " + r4); // true
		
		float num3 = 1;
		double num4 = 0.1;
		boolean r5 = (num3 == num4);
		System.out.println("r5 : " + r5); // false
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean r6 = (num5 == num6);	// false
		boolean r7 = (num5 == (float)num6);	// true
		System.out.println("r6 : " + r6);
		System.out.println("r7 : " + r7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean r8 = (str1.equals(str2)); // false
		boolean r9 = (! str1.equals(str2)); // true
		System.out.println("r8 : " + r8);
		System.out.println("r9 : " + r9);
		
		
	}

}
