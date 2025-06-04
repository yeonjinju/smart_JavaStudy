package 코테문제;

import java.util.Scanner;

public class Ex06예제 {

	public static void main(String[] args) {
		// 거스름돈을 입력 받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램
		// 최대단위는 10000원, 최소단위는 100원
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		
		System.out.println("\n잔돈 : " + total + "원");
		
		if(total>=10000) {
			int man = total/10000;
			System.out.println("10000원 : "+man+"개");
			total %= 10000;
		}else {
			System.out.println("10000원 : 0개");
		}
		if(total>=5000) {
			int oh = total/5000;
			System.out.println("5000원 : "+oh+"개");
			total %= 5000;
		}else {
			System.out.println("5000원 : 0개");
		}
		if(total>=1000) {
			int ch = total/1000;
			System.out.println("1000원 : "+ch+"개");
			total %= 1000;
		}else {
			System.out.println("1000원 : 0개");
		}
		if(total>=500) {
			int ob = total/500;
			System.out.println("500원 : "+ob+"개");
			total %= 500;
		}else {
			System.out.println("500원 : 0개");
		}
		if(total>=100) {
			int b = total/100;
			System.out.println("100원 : "+b+"개");
			total %= 100;
		}else {
			System.out.println("100원 : 0개");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
