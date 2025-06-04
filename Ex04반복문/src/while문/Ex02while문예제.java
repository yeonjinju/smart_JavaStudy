package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
		// 키로브로부터 입력받은 수를 누적시키는 프로그램을 작성하세요.
		// -1 입력하면 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		int result = 0;
		result += input;
		
		while (input != -1) {
			System.out.println("누적결과 : " + result);
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			result += input;
		}
		
// 		병호님 풀이
//		int input = 0;
//		int result = 0;
//		
//		while (input != -1) {
//			System.out.println("정수 입력 : ");
//			input = sc.nextInt();
//			result += input;
//			System.out.println("누적결과 : " + result);
//		}
		
//		선생님 풀이
//		사용자의 입력값
//		int input = sc.nextInt();
//		System.out.println("사용자의 입력갓 : " + input);
//		 입력값 누적용 변수
//		int sum = 0;
//		
//		while(input != -1) {
//			사용자에게 입력받은 값을 누적 저장
//			sum += input;
//			System.out.println("누적값 : " + sum);
//			
//			입력값이 -1이 아닌 경우에는 다시 입력받기
//			input = sc.nextInt();
//			System.out.println("다시 입력 받은 값" + input);
//			
//		}
		

	}

}
