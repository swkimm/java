package ch18.sec03.exam01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		
		try(InputStream is = new FileInputStream("output/test1.txt")) {
			
			while(true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
