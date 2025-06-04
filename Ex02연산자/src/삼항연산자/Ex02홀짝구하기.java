package 삼항연산자;

import java.util.Scanner;

public class Ex02홀짝구하기 {

	public static void main(String[] args) {
		// 1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수를 입력 받아서 저장
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 3. 입력받은 정수가 홀수인지 짝수인지 판별
		String result = (num%2)==0 ? "짝수입니다" : "홀수입니다";
		
		// 4. 결과 출력
		System.out.println("입력받은 정수는 " + result);
		
		
		
	}

}
