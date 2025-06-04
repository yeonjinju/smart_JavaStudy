package 이중for문;

public class Ex09역별다시찍기 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *

		for(int i=0; i<5; i++) {
			for(int j=i+1; j<6; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		
		
		
		
	}

}
