package 메소드기초;

import java.util.Scanner;

public class Ex07메소드예제_절댓값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번재 정수 입력 :");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 :");
		int num2 = sc.nextInt();
		
		int result = getAbsoluteValue(num1, num2);
		System.out.print("결과확인 :"+result);
//		System.out.print("결과확인 :" + getAbsoluteValue(num1, num2));
		
	}

	private static int getAbsoluteValue(int num1, int num2) {
		int result;
		if(num1>num2) {
			result = num1-num2;
		}else {
			result=num2-num1;
		}
		return result;
//		return Math.abs(num1 - num2);
	}

}
