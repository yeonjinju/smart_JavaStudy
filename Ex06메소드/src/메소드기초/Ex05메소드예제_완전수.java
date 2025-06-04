package 메소드기초;

public class Ex05메소드예제_완전수 {

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		
		// num=2부터 1000이하까지 증감하면서 반복해서 isPerFect에 담아서 출력
		for(int num=startValue; num<=endValue; num++) {
			if(isPerfect(num)) {
				System.out.println(num);
			}
		}
	}
	// 완전수인지 확인
	public static boolean isPerfect(int num) {
		int sum =0;
		// i가 1부터 1000/2 몫이 짝수일때까지 
		for(int i=1; i<=num/2; i++) {
			// 나머지가 0이면 == 완전수이면
			if(num%i==0) {
				// sum 합산
				sum+=i;
			}
		}				
		// sum과 num 이 같은지 확인해서 true,false반환
		return sum==num;
	}
}
