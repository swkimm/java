package ch14.lecture.p01thread;

public class C06Thread {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread06());
		t1.start();
		
		while (true) {
			System.out.println("&& main 스레드 ");
		}
	}
}

class MyThread06 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println("&& 작업 스레드 ");
		}
	}
	
}
