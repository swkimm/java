package ch14.lecture.p01thread;

public class C03Thread {
	public static void main(String[] args) {
		Process03 p1 = new Process03();
		Thread t1 = new Thread(p1);
		t1.start();
		while(true) {
			System.out.println("$$$$$$$ main thtread $$$$ ");
		}
	}
}

class Process03 implements Runnable	 {
	public void run() {
		while (true) {
			System.out.println("&&& 쓰레드 진행 중 &&&");
		}
	}
}
