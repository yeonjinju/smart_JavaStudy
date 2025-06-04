package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
		// [예제3]
		// 1. 사용자에게 현재 몸무게, 목표 몸무게를 입력 받아서 저장
		// 1-2. 현재 몸무게 (now), 목표 몸무게(goal) 입력 받아서 저장
//		int now = sc.nextInt(); -> 현재몸무게
//		int goal - sc.nextInt(); -> 목표몸무게
//		int kg = 0; -> 주차별 감량 몸무게
//		int week = 1; -> 주차
//		
//		// 2. 주차별 감량 몸무게를 계속 입력받기 (1주차~)
//		while(now>goal) {
//			//2-1. 감량 몸무게 입력받기
//			System.out.println(week++ + "감량몸무게 >> ");
//			kg = sc.nextInt();
//			//2-2. 현매 몸무게에서 감량 몸무게 빼기
//			now = now-kg;
//		}
//		// 3. 종료조건 : 몸무게가 목표 이하가 되었을 때!
//		// 			--> 종료 후 "축하합니다!!!"를 출력하기
//		System.out.println(now + "달성! 축하해!");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int week = 0;
		int minus = 0;
		
		while(!(now <= goal)) {
			System.out.print(++week+ "주차 감량 몸무게 : ");
			minus = sc.nextInt();
			
			now -= minus;
			
		} System.out.println(now + "kg 달성!! 축하합니다!");
		
		
		
	}

}
