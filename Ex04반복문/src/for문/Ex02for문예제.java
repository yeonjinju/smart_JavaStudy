package for문;

import java.util.Scanner;

public class Ex02for문예제 {

	public static void main(String[] args) {
		// 구구단 2단을 출력하세요.
		
//		for(int i = 1; i<10; i++) {
//			System.out.println("2*" + i + "=" + 2*i );
//		}
		
		// 사용자가 지정한 단의 계산을 출력하세요.
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("단 입력 >> ");
//		int dan = sc.nextInt();
//		
//		for(int i=1; i<10; i++) {
//			System.out.println(dan + "*" + i + "=" + dan*i);
//			
//		}
		
		// 원하는 단과 어느 수까지 출력할건지 입력받아 구구단 출력
		System.out.print("단 입력 >> ");
		int dan = sc.nextInt();
		
		System.out.print("어느 수까지 출력 >> ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		
		
		
		
		
		
		
		
	}

}
