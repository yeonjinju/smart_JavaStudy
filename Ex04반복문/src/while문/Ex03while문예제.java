package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {
		// [예제2]
		// 사용자의 입력값에서 홀수, 짝수 갯수를 세는 프로그램
		// -1을 입력하면 프로그램 종료
		// 입력값을 판별 -> 홀수라면, 홀수카운트+1, 짝수라면 짝수카운트+1
		// ---> 홀수 셀 수 있는 상자, 짝수 셀 수 있는 상자가 필요함!!
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int odd = 0;
		int even = 0;
		
		while(num != -1) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			
			if (num%2 == 0 && num != -1) {
				System.out.println("짝수 개수 : " + (++even));
				System.out.println("홀수 개수 : " + odd);
			} else if (num%2 == 1 && num != -1) {
				System.out.println("짝수 개수 : " + even);
				System.out.println("홀수 개수 : " + ++odd);
			}
		} System.out.println("종료되었습니다.");
		
		
//		선생님 풀이
//		1. 사용자에게 입력받기
//		int input = sc.nextInt();
//		
//		1-1. 짝/홀 카운트용 변수 만들기
//		int j = 0;
//		int h = 0;
//		
//		2. 반복
//		반복조건 : -1이 아니라면 !
//		할일 : 입력값이 짝/홀 판별 --> 짝수 홀수 갯수 카운트
//		while (input != -1) {
//			if(input%2==0) {
//				j++;
//			} else {
//				h++;
//			}
//			
//			input=sc.nextInt();
//		}

	}

}
