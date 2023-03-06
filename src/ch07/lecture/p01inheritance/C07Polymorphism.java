package ch07.lecture.p01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		
//		Horse h1 = (Horse)a1;
//		Horse h2 = (Horse)new Animal();
		
		Animal a = new Animal();
		
		
		a.breath();
		a1.breath(); // horse
		a2.breath(); // fish
	
	
	}
}


class Animal {
	public void breath() {
		System.out.println("호흡한다.");
	}	
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다.");
	}
}

class Fish extends Animal {
	@Override
	public void breath() {		
		System.out.println("아가미로 호흡한다.");
	}
}