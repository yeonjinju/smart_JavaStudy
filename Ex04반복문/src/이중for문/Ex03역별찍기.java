package 이중for문;

public class Ex03역별찍기 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int j=0;j<5;j++) {
			for(int i=5;i>j;i--) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
