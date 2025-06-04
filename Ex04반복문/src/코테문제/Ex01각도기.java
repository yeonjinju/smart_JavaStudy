package 코테문제;

import java.util.Scanner;

public class Ex01각도기 {

	public static void main(String[] args) {
		// 각에서 0도초과 90도 미만은 예각
		// 90도는 직각
		// 90도 초과 180도 미만은 둔각
		// 180도는 평각
		// 각도 angle이 변수로 주어질 때 각도를 계산해서
		// "예각", "직각", "둔각", "평각"을 출력
		
		Scanner sc = new Scanner(System.in);
		
		int angle = sc.nextInt();
		
		if(angle>0 && angle<90) {
			System.out.println("예각");
		} else if(angle == 90) {
			System.out.println("직각");
		} else if(angle>90 && angle<180) {
			System.out.println("둔각");
		} else if(angle==180) {
			System.out.println("평각");
		}

		
		
		
		
		
		
		
	}

}
