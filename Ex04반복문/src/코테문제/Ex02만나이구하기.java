package 코테문제;

import java.util.Scanner;

public class Ex02만나이구하기 {

	public static void main(String[] args) {
		// 사용자가 년,월,일에 해당하는 숫자를 입력하면
		// 2000년 3월 5일생의 만 나이를 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("태어난 연도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		if(month<=3 && day<=6) {
			System.out.println("만 "+ (2025-year) + "세");
		} else {
			System.out.println("만 " + (2025-year-1) + "세");
		}
		 
		
		
		

	}

}
