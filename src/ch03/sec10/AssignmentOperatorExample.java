package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		int res = 0;
		res += 10; //res = res + 10
		System.out.println("res=" + res); //10
		res -= 5;  //res = res - 5;
		System.out.println("res=" + res); //5
		res *= 3;
		System.out.println("res=" + res); //15
		res /= 5;
		System.out.println("res=" + res); //3
		res %= 3;
		System.out.println("res=" + res); //0
			}

}
