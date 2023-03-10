package ch13.exercise.example03;

import java.awt.*;

public class ContainerExample {
	public static void main(String[] args) {
		
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + job);
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + age);
		
	}
}

class Container<T, U> {
	public T t;
	public U u;
	public T getKey() {
		return t;
	}
	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	public U getValue() {
		return u;
	}
	
	
	
}