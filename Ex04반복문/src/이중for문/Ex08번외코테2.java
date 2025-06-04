package 이중for문;

import java.util.Scanner;

public class Ex08번외코테2 {

	public static void main(String[] args) {
		// 개미 군단이 사냥을 나가려고 합니다.
		// 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
		// 장군개미는 5의 공격력, 병정개미는 3의 공격력, 일개미는 1의 공격력 보유
		// 가능한 최소 병력으로 사냥을 하려고 합니다
		// 사냥감의 체력hp가 변수로 주어질 때, 최소한의 병력을 구성하려면
		// 몇마리의 개미가 필요한지 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사냥감의 수 : ");
		int hp = sc.nextInt();
		
		int j = hp/5;
		int b = hp%5/3;
		int i = hp%5%3/1;
		
		System.out.println("총 필요한 개미 수 : " + (j + b + i));

		
		
		
		
		
		

	}

}
