package 단항이항연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		// [실습] 백의 자리 이하 버리기
		
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 정수 입력 받아서 num에 저장		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 3. 백의 자리 이하를 버리기
		// ---> 내가 백의 자리 이하 버리는 걸 어떻게 머리에서 계산했지? 생각해보기
		int result = num/100*100;
				
		// 4. 결과값을 출력
		System.out.println("결과 값 : " + result);
		
		
	}

}
