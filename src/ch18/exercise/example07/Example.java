package ch18.exercise.example07;

import java.io.*;

public class Example {
	public static void main(String[] args) throws Exception {
		String filePath ="src/ch18/exercise/example07/Example.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData = null;
		while(true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(rowNumber + "\t" + str);

			rowNumber++;
			
		}
		br.close();
	}
}
