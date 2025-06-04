package 추상클래스;

public abstract class Employee {
	// 필드
	protected String empno; // 사번
	protected String name; // 이름
	protected int pay; // 연봉
	
	// 메소드
	public abstract int getMoneyPay();

	public String print() {
		return empno + " / "+name+" / "+pay;
	}

	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	

}
