package 메소드기초;

public class Ex04메소드예제_약수의합 {

	public static void main(String[] args) {
		int num = 10;
		int result = getSumOfDivisiors(num);
		
//		System.out.println(num+"약수의 합 : "+result);
		System.out.println(result);
	}
	public static int getSumOfDivisiors(int num1) {
		int sum = 0 ; // 약수의 합을 알고싶은 수
		
		// int 값을 0부터 num까지 반복하면서 %을때 나머지가 0이면 약수를 result값에 더하게 한다.
		for(int i=1; i<=num1; i++) {
			if(num1 % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}

}
