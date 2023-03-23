package ch18.lecture.p06buffered;

import java.io.*;

public class C03BufferedinputStream {
	public static void main(String[] args) {

		String name = "output/buffered1.txt";

		try (InputStream fis = new FileInputStream(name);
				InputStream is = new BufferedInputStream(fis)) {

			long start =System.nanoTime();
			while  (is.read() != -1) {
				
			}
			long end = System.nanoTime();
			System.out.println((end-start) + "ns");
			
			
		} catch (Exception e) {

		}
	}
}
