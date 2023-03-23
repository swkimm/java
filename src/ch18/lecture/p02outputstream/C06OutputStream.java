package ch18.lecture.p02outputstream;

import java.io.*;

public class C06OutputStream {
	public static void main(String[] args) {
		
		try(var os = new FileOutputStream("output/output6.txt")) {
			
			// 한바이트 쓰기 
			os.write(298734);
			os.write(922378890);
			
			// 여러바이트 쓰기 
			byte[] data = {3,1,0,127,64};
			os.write(data);
			os.write(data);
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
