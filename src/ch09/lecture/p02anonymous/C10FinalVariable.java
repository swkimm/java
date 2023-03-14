package ch09.lecture.p02anonymous;

public class C10FinalVariable {

	int j;
	
	public void method1() {
		int i = 3;
		j = 99;
		j = 100;
		class LocalClass {
			void method2() {
				System.out.println(i);
				System.out.println(j);
			}
		}
	}
}
