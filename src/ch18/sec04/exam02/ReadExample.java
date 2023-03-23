package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		String name = "output/writer2.txt";
		try (Reader rd = new FileReader(name)) {

			while (true) {
				int data = rd.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
			System.out.println();

			char[] data = new char[100];
			while (true) {
				int num = rd.read(data);
				if (num == -1)
					break;
				for (int i = 0; i < num; i++) {
					System.out.print(data[i]);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
