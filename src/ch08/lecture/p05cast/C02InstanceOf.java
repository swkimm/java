package ch08.lecture.p05cast;

import javax.sql.rowset.serial.*;

public class C02InstanceOf {
	public static void main(String[] args) {
		
	MyInterface02 o1 = new MyClass021();
	MyInterface02 o2 = new MyClass022();
	
	MyClass021 o3 = (MyClass021) o1;
	MyClass022 o4 = (MyClass022) o2;

	MyClass022 o5 = (MyClass022) o1;
	
	
	System.out.println("실행 흐름 이어감");
	}
}
