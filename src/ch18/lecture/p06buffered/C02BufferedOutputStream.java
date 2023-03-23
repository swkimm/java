package ch18.lecture.p06buffered;

import java.io.*;

public class C02BufferedOutputStream {
	public static void main(String[] args) {
		
	String name = "output/buffered2.txt";

	try (
			OutputStream fis = new FileOutputStream(name);) {
		long start = System.nanoTime();
		for (int i = 0; i < 1000_000; i++) {
			fis.write(1);
		}
		fis.flush();
		long end = System.nanoTime();

		System.out.println((end - start) + "ns");

	} catch (Exception e) {
		e.printStackTrace();
	}

	}
}
