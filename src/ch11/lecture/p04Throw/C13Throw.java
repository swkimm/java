package ch11.lecture.p04Throw;

import java.io.*;

public class C13Throw {
	
	public static void method3() throws Exception {
		
	}
	
	
	public static void main(String[] args) throws Exception {
		method2();
	}
	
	public static void method2() throws Exception  {
		method1();
	}
	
	
	public static void method1() throws Exception {
		new FileInputStream("");
	}
}
