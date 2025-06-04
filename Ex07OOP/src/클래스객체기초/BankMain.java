package 클래스객체기초;

public class BankMain {
	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.money = 1000;
		
		b.inMoney(100); // 입금
		b.outMoney(300); // 출금
		
//		System.out.println(b.money);
		System.out.println("잔액은"+b.showMoney());
		b.showMoney();
		
	}
}
