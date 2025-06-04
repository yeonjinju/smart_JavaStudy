package 이중for문;

public class Ex02별찍기기초 {

	public static void main(String[] args) {

		// ***** 출력
		// i가 어떤 숫자로 시작하든 상관 없음. 횟수에 의의
//		for(int i=0; i<5; i++) { //0~4까지 5회 반복
//			System.out.print("*");
//		}

		// *****
		// *****
		// *****
		// *****
		// *****
		// 2. 1번 for문을 5번 반복하는 for문
//		for (int j = 0; j < 5; j++) {
//			// 1. *****를 만드는 for문
//			for (int i = 0; i < 5; i++) { // 0~4까지 5회 반복
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

		// *
		// **
		// ***
		// ****
		// *****
		for(int j=0; j<5; j++) {
		for(int i=0; i<=j; i++) {
			System.out.print("*");
		} System.out.println();
		}
		

			
			
			
		
		
		
		
		
		
		
		
		
		
	}

}
