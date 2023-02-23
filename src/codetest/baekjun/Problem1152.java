package codetest.baekjun;

import java.util.Scanner;

class Problem {
	public int problem(String str) {
		int answer = 0;
		String[] arr = str.split(" ");

		return answer = arr.length;

	}
}

public class Problem1152 {

	public static void main(String[] args) {

		int answer =0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		
		for(int i =0; i<arr.length; i++) {
			if(!arr[i].equals("")) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}

//		Problem pro = new Problem();
//		
//		int sol = pro.problem("The Curious Case of Benjamin Button");
//		System.out.println(sol);