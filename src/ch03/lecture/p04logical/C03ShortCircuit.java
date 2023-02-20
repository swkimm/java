package ch03.lecture.p04logical;

public class C03ShortCircuit {

	public static void main(String[] args) {

		// &&

		int x = 10;
		if ((x++ > 0) && (x++ < 100)) {
			System.out.println("실행");
		}

		x = 10;
		if ((x++ > 0) & (x++ < 5)) {
			System.out.println("실행1");
		}
		System.out.println(x);

		// shortcut circuit
		x = 10;
		if ((x++ > 100) & (x++ < 200)) {
			System.out.println("실행됨2");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) & (x++ < 0)) {
			System.out.println("실행됨3");
		}
		System.out.println(x);
		
	}

}
