package 배열실습;

public class Ex01배열실습_가장큰수 {

	public static void main(String[] args) {
		// [실습] 가장 큰 수 찾기
		
		// 1. 정수 데이터 5개를 저장할 수 있는 배열 array 만들기
		// --> 정수 데이터는 6,3,8,4,2
		// 2. 배열 안의 데이터 중 가장 큰 값을 출력
		
		int[] array = {6,3,8,4,2};
		int a = 0;
		
		System.out.print("array에 들어있는 값 : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + ", ");
		}
		
		for(int i=0;i<array.length;i++) {
			if(a<array[i]) {
				a=array[i];
			}
		}
		System.out.println("\n가장 큰 값은 "+a+"입니다.");
		
		
		
		

	}

}
