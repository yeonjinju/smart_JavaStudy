package 코테문제;

import java.util.Random;

public class Ex04로또번호뽑기 {

	public static void main(String[] args) {
		// 랜덤수 추출을 활용해서, 로또 번호 6개 뽑기!
		// 로또 번호는 1~45 범위
		// 중복번호가 뜰 수 있는데, 그거 해결하면 별 4개짜리...
		
		Random ran = new Random();
		
		System.out.print("로또 번호 추출 : ");
		
		for(int i=0; i<6; i++) {
			int ranNum = ran.nextInt(45)+1;
			System.out.print(ranNum + " ");
		}
		

	}

}
