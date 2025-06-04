package 추상클래스;

public class Main {

	public static void main(String[] args) {
		RegularEmployee reg = new RegularEmployee("SMHRD001", "홍길동", 4000, 100);
	    System.out.println(reg.print());
	    System.out.println(reg.getMoneyPay());
	      
	    TempEmployee tem = new TempEmployee("SMHRD002", "박ㅇ수", 3000);
	    System.out.println(tem.print());
	    
	    PartTimeEmployee par = new PartTimeEmployee("SMHRD003", "임성훈", 10, 20);
	    System.out.println(par.print());
	}

}
