package ch18.lecture.p07print;

import java.io.*;

public class C01PrintWriter {
	public static void main(String[] args) {
		// 문자 단위 출력 스트림
		String name = "output/print1.txt";

		try (
				PrintWriter pw = new PrintWriter(name)) {

			pw.println(33333);
			pw.println(3.14);
			pw.println(true);
			pw.println("Hello World");
			pw.println("슬램덩크");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
