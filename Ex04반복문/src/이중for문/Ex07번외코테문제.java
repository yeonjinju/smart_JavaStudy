package 이중for문;

import java.util.Scanner;

public class Ex07번외코테문제 {

	public static void main(String[] args) {
		// 어떤 세균은 1시간에 두 배만큼 증식한다고 합니다.
		// 처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때
		// t시간 후 세균의 수를 출력
		// n이 2, t가 10이라면, 결과는 2048
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세균의 수 : ");
		int n = sc.nextInt();
		
		System.out.print("경과한 시간 : ");
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) {
			n*=2;
		} System.out.println("결과는 : " + n);

	}

}
