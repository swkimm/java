package ch14.lecture.p04name;

public class C03Name {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			Thread t = Thread.currentThread();
		});
		t1.setName("작업 쓰레드1");
		t1.start();
	}
}
