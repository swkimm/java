package ch07.lecture.p02polymorphism;

public class C05Polymorphism {
	public static void main(String[] args) {

		Hero h = new Hero();

		h.weapon = new Gun();
		h.button1();
		
		h.weapon = new Bow();
		h.button1();
	}
}

class Weapon {
	public void attack() {
		System.out.println("공격하다.");
	}
}

class Sword extends Weapon {
	public void attack() {
		System.out.println("칼을 휘두릅니다.");
	}
}

class Gun extends Weapon {
	public void attack() {
		System.out.println("총을 쏩니다.");
	}
}

class Bow extends Weapon {
	public void attack() {
		System.out.println("활을 쏩니다.");
	}
}

class Hero {
	public Weapon weapon;

	public void button1() {
		weapon.attack();
	}

}
