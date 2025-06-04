package 배열실습;

import java.util.Random;

public class Ex09로또번호추첨 {

	public static void main(String[] args) {
		// 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언
		// 배열 안의 데이터를 차례대로 랜덤 값으로 넣어주세요 (1~10)
		// 단, 데이터를 넣는 중에 중복값이 발생하면,
		// 해당하는 인덱스의 번호를 다시 뽑아야합니다
		
		// 모든 인덱스에 데이터가 들어가면,
		// 배열 안의 데이터를 모두 출력해주세요
		// [결과] 이번주 추첨번호는 ~~ 1 2 3 4 5
		
		Random ran = new Random();
		
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++) {
			array[i]=ran.nextInt(10)+1;
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) {
					i--;
					break;
				}
				}
			}
			
			
		
		System.out.print("이번주 추첨번호는 ~~ ");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
