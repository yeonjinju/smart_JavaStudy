package 인터페이스;

import 추상클래스.Employee;

public class Child extends Employee implements Temp, Temp2{
	
	public Child(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	@Override
	public int getMoneyPay() {
		return 0;
	}

	@Override
	public void temp() {
	}
}
