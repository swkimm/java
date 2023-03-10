package ch12.lecture.p01object;

import java.util.*;

public class C21Equals {

	public static void main(String[] args) {
		Object o1 = new MyClass21(5);
		Object o2 = new MyClass21(5);
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o1.equals(o2));
		
		
	}
}

class MyClass21 {
	private int id;
	
	MyClass21(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof MyClass21)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass21 other = (MyClass21) obj;
		return id == other.id;
	}
}