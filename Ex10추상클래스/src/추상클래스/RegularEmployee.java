package 추상클래스;

public class RegularEmployee extends Employee {

	int bonus; // 보너스
	
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}
	
	
	
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
}
