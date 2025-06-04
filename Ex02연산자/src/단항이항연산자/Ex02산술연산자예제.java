package 단항이항연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// 사용자에게 두 수를 입력받아
		// 덧셈, 뺄셈, 곱셈, 나눗셈(소숫점포함) 해보기!
		
		// 1. 입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		// 2. 사용자에게 숫자 두 개 입력받기
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = sc.nextInt();
		
		// 3. 연산 결과 출력
		System.out.println("더한 결과 값 : " + (a+b));
		System.out.println("뺀 결과 값 : " + (a-b));
		System.out.println("곱한 결과 값 : " + (a*b));
		System.out.println("나눈 결과 값 : " + ((double)a/b));
		
		
		
		
		
	}

}
