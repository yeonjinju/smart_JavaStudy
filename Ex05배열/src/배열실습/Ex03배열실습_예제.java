package 배열실습;

import java.util.Scanner;

public class Ex03배열실습_예제 {

	public static void main(String[] args) {
		// 숫자 10개를 입력받은 후 3의 배수인 숫자를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		
		
		//꼼수 방법
//		String result = "3의 배수는 : ";
		
		
		for(int i=0; i<array.length; i++) {
			System.out.print(i+1+"번 째 정수 입력 >> ");
			array[i] = sc.nextInt();
//			if(array[i]%3==0) {
//				result += array[i]+ " ";
//			}
		}
		
//		System.out.println(result);
		
		System.out.print("3의 배수 : ");
		for(int i=0; i<array.length; i++) {
			if(array[i]%3==0) {
				System.out.print(array[i]+" ");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
