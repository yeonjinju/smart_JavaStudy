package 배열실습;

import java.util.Scanner;

public class Ex04머쓱이키비교 {

	public static void main(String[] args) {
		// [프로그래머스 - 머쓱이보다 키 큰 사람]
		// 머쓱이는 학교에서 키 순으로 줄을 설 때 몇번째로 서야하는지 궁금해졌다
		// 머쓱이네 반 친구들의 키가 담긴 정수 배열 array
		// 머쓱이의 키 height
		// 머쓱이보다 키 큰 사람 수를 출력
		// --> array는 {149,180,192,170}
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = {149,180,192,170};
		
		System.out.print("머쓱이의 키 : ");
		int height=sc.nextInt();
		int total=0;
		
		for(int i=0;i<array.length;i++) {
			if(height<array[i]) {
				total+=1;
			}
		}
		System.out.print("키 큰 사람 수 : " + total);
		
		

	}

}
