package 메소드기초;

public class Ex06메소드실습_배열매개변수 {
	public static void main(String[] args) {
		// array 배열에 값을 담고
		int[] array = {15,10,2,8,23};
		// array의 평균값을 출력
		System.out.println(average(array));
	}
	
	public static double average(int[] array){
		// sum값을 0으로 초기화 시키고
		int sum =0;
		// int 0부터 array길이에 있는 값까지 반복하면서 sum에 누적합하고
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		// double형태로 몫 나타내기
		return (double)sum/array.length;
	}
}
