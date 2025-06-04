package 코테문제;

import java.util.Scanner;

public class Ex07예제 {

	public static void main(String[] args) {
		// 1보다 큰 정수(N)을 입력하여 N!값을 구하시오.
		// 팩토리얼이란 N의 수보다 작거나 같은 모든 양의 정수의 곱
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		int j = 1;
		int total = 0;
		
		for(int i=1;i<=n;i++) {
			j *= i;
			total = j *i;
			
			
		}
		System.out.println("출력 : "+total);
		
		
		
		
		
		
	}

}
