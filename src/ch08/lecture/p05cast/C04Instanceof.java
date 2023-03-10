package ch08.lecture.p05cast;

import java.io.*;

public class C04Instanceof {
	public static void main(String[] args) {
		String s1 = "java";
		
		System.out.println(s1 instanceof String);
		System.out.println(s1 instanceof Object);
		System.out.println(s1 instanceof CharSequence);
		System.out.println(s1 instanceof Comparable);
		System.out.println(s1 instanceof Serializable);
	}
}
