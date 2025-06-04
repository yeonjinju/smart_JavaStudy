package 배열실습;

import java.util.Scanner;

public class Ex02배열실습_정수계산 {

	public static void main(String[] args) {
		// [실습] 점수계산
		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array 만들기
		// 2. 반복해서 사용자에게 값을 입력받고,
		//    바로 배열의 인덱스에 차례대로 저장
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];		
		
		// 반복하면서 배열의 값을 입력받는 for문
		for(int i=0;i<array.length;i++) {
			System.out.print(i+1 + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("입력된 점수 : ");
		
		// array의 전체 데이터를 출력하는 for문
		for(int i=0;i<array.length;i++) {
			if(i<array.length-1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		
		// array를 돌면서, 최고/최저/총합/평균을 계산하고,
		// for문이 종료된 이후에 4개 결과를 출력
		
		// 1. 최고/최저/총합/평균 변수 만들기
		int max = 0;
		int min = array[0];
		int sum = 0;
		float avg = 0f;
		
		// 2. for문 돌면서 계산하기
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			} 
			if(min>array[i]) {
				min = array[i];
			}
			sum += array[i];
		} avg = (float)sum / array.length;
		
		System.out.println("\n최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);
		
		
		
		
		

		
		
		
		
		
		
	}

}
