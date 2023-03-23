package ch18.sec02.exam01;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		
		try {
			OutputStream os = new FileOutputStream("output/test1.txt");
		
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
