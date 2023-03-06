package ch06.exercise.exam20;

public class Account {

	private String accountNumber;
	private String name;
	private int money;
	
	public Account() {
		
	}
	
	public Account(String accountNumber, String name, int money) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.money = money;
	}
	

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	public void setMoneyPlus(int money, int plus) {
		this.money = money + plus;
		
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", money=" + money + "]";
	}

	public void setMoneyMinus(int money, int minus) {
		this.money = money - minus;
		
	}

}
