package 이중for문;

import java.util.Scanner;

public class Ex04예제 {

	public static void main(String[] args) {
		// 행 개수를 입력 받아 별로 삼각형 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for(int j=0;j<num;j++) {
			for(int i=num;i>j;i--) {
				System.out.print("*");
			} System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
