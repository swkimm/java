package ch09.exercise.example06;

public class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};

	void method1() {
		Vehicle localVar = new Vehicle() {
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}

}
