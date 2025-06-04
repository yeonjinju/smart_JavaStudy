package 배열실습;

public class Ex05배열두배 {

	public static void main(String[] args) {
		// 배열 array의 각 인덱스의 값을 두배씩 가진 배열을 만들어서 출력
		// array는 {2,4,6,8,10}
		// result는 {4,8,12,16,20}
		
		int[] array = {2,4,6,8,10};
		int[] result = new int [array.length];
		
		for(int i=0; i<array.length; i++) {
			result[i] = array[i]*2;
		}
		
		System.out.print("array : ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.print("\nresult : ");
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		
		
		
		
		
		

	}

}
