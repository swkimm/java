package ch15.exercise.ch06.example20;

public class Account {
	String num;
	String name;
	int money;
	
//	public Account(String num, String name, int money) {
//		super();
//		this.num = num;
//		this.name = name;
//		this.money = money;
//	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", name=" + name + ", money=" + money + "]";
	}
	
	
}

