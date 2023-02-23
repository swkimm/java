package ch05.lecture.p04string;

public class C03Split {

	public static void main(String[] args) {
		// split
		// 특정 문자패턴으로 문자열을 나눠서 배열로 리턴
		
		String str1 = "hello,java,world,css,html";
		String[] arr1 = str1.split(",");
		
		for(int i =0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		
		String str2 = "spring react vue angular jsp sass";
		String[] arr2 = str2.split(" ");
	
		for(int i =0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String str3 = "I'm ironman.";
		String[] arr3 = str3.split("");
		System.out.println(str3.length());
		System.out.println(arr3[0]);
		System.out.println(arr3[arr3.length-1]);
		for(int i =0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}
