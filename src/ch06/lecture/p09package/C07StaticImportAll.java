package ch06.lecture.p09package;

import ch06.lecture.p09package.package1.*;

import static ch06.lecture.p09package.package1.MyClass05.*;


//import static ch06.lecture.p09package.package1.MyClass05.method1;
//import static ch06.lecture.p09package.package1.MyClass05.method2;
//import static ch06.lecture.p09package.package1.MyClass05.name;


public class C07StaticImportAll {
	public static void main(String[] args) {
		String n = MyClass05.name;
		MyClass05.method1();
		MyClass05.method2();
	}
}
