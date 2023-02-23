package codetest.baekjun;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10798 {

	public static void main(String[] args) {

		String input = """
				ABCDE
				abcde
				01234
				FGHIJ
				fghij""";

		Scanner scan = new Scanner(input);

		String[] tokens = input.split("\n");

		System.out.println(Arrays.toString(tokens));

//		int i, j =0;
//		int len = tokens[0].length();
		char c =' ';
		String str = ""; 
		int max =0;
		
		for(int i = 0; i < tokens.length; i++) {
			if (max < tokens[i].length()) {
				max = tokens[i].length();
			}
		}
		
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < 5; j++) {
				str = String.valueOf(tokens[j].charAt(i));			
				System.out.print(str);
			}
		}

	}

}
