package ch18.lecture.p04writer;

import java.io.*;

public class C01Writer {
	public static void main(String[] args) {
		// Writer : 문자 단위 출력 스트림 
		// 주요 메소드 : write 
		
		String fileName = "output/writer1.txt";
		try(Writer wr = new FileWriter(fileName);) {
			wr.write('a');
			wr.write('b');
			wr.write('가');
			wr.write('나');
			wr.write(9850);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}