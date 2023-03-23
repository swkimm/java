package ch18.sec02.exam02;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		
		try(OutputStream os = new FileOutputStream("output/outputexam1")) {
			byte[] array = {10,20,30,40,50};
			os.write(array, 1,3);
			
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
