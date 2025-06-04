package while문;

import java.util.Scanner;

public class Ex05while문예제 {

	public static void main(String[] args) {
		// A,B숫자를 입력 받는다.
		// A-B를 출력한다.
		// A와 B가 모두 0을 입력받으면 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A 입력 : ");
		int a = sc.nextInt();
		System.out.print("B 입력 : ");
		int b = sc.nextInt();
		
		while(!((a==0)&&(b==0))) {			
			System.out.println("결과 : " + (a - b));
			System.out.print("A 입력 : ");
			a = sc.nextInt();
			System.out.print("B 입력 : ");
			b = sc.nextInt();
			
		} 
		// !((a==0)&&(b==)) 는 (a!=0)||(b!=0)과 같다

	}

}
