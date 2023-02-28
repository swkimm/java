package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {

		Car myCar = new Car();
		
		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		
		Car yourCar = new Car();
		System.out.println("모델명 : " + yourCar.model);
		System.out.println("시동여부 : " + yourCar.start);
		System.out.println("현재속도 : " + yourCar.speed);
		
		myCar.speed = 100;
		System.out.println("현재속도 : " + myCar.speed);
		
		Car hisCar = yourCar;
		yourCar.speed = 50;		
		System.out.println("현재속도 : " + yourCar.speed);
		System.out.println("현재속도 : " + hisCar.speed);
		
		System.out.println(System.identityHashCode(myCar));
		System.out.println(System.identityHashCode(yourCar));
		System.out.println(System.identityHashCode(hisCar));
		
		
	}
}
