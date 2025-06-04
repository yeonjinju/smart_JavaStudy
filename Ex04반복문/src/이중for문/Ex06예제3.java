package 이중for문;

import java.util.Scanner;

public class Ex06예제3 {

	public static void main(String[] args) {
		// 정수 n을 입력받아 1,2,4,7,11과 같은 수열의
		// n번째 항까지 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int sum = 1;
		
		
		for(int i=0;i<n;i++) {
			sum+=i;
			System.out.print(sum + " ");
		}
		
		
		
		
		

	}

}
