package 메소드기초;

public class Ex03메소드예제_약수 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		boolean Divisor = isDivisor(num1,num2);
		
		System.out.println(Divisor);
	}

	// int 타입을 받으니까 boolean형식으로 받고 isDivisor변수 생성
	public static boolean isDivisor(int num1, int num2) {
		boolean result;
		if(num1 % num2==0) {
			return true;
		}else {
			return false;
		}
	}
}
