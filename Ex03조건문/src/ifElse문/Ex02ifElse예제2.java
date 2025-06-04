package ifElse문;

import java.util.Scanner;

public class Ex02ifElse예제2 {

	public static void main(String[] args) {
		// 입장료 : 5000
		int ticket = 5000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== EVERLAND RESORT ====");
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
		
	
		
		if(age<20) {
			System.out.println("총 " + (int)(ticket*num*0.5) + "원 입니다.");
		} else {
			System.out.println("총 " + (ticket*num) + "원 입니다.");
		}

	}

}
