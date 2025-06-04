package 배열실습;

import java.util.Random;

public class Ex10짝꿍예제2 {

	public static void main(String[] args) {
		// 랜덤수를 부여받고 오름차순 정렬하기
		
		Random ran = new Random();
		
		int[] a = new int[6];
		
		for(int i=0; i<a.length; i++) {
			a[i] = ran.nextInt(10)+1;
			System.out.print(a[i] + " ");
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<i; j++) {
				if(a[i]<a[j]) {
					int b = a[j];
					a[j] = a[i];
					a[i] = b;
					i--;
				}
			}
		}
		 
		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			System.out.print (a[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
