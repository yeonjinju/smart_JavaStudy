package 변수와자료형;

public class Ex02자료형 {

	public static void main(String[] args) {
		// 자바의 자료형
		// 기본 자료형, 참조 자료형
		
		// 1. 기본 자료형
		// 메모리에 값을 직접 저장한다
		// 종류 : 논리형, 문자형, 정수형, 실수형
		
		// 1-1) 논리 자료형 : boolean
		// : 참(true)이나 거짓(false)을 저장하는 자료형
		boolean b = true;
		
		// 1-2) 문자 자료형 : char
		// : 한 글자만 저장할 수 있음. 작은 따옴표를 사용해서 작성
		char c = 'a';
		
		// 1-3) 정수 자료형 
		// : byte(1byte), short(2byte), int(4byte), long(8byte)
		// --> 데이터의 크기가 의미하는 건 표현할 수 있는 범위
		// 정수를 저장하면, java는 기본적으로 int로 인식
		
		// 1-4) 실수 자료형
		// : float(4byte), double(8byte) >> 기본값 double
		// 소수점을 포함하는 수를 저장할 수 있음
		
		// [예제] 3.14라는 데이터를 담는 double타입의 변수 num1을 선언
		double num1 = 3.14;
		// [예제] 12.25라는 데이터를 담는 float 타입의 변수 num2 선언
		float num2 = (float) 12.25; // 방법1
		float num3 = 12.25f; // 방법2 - 일종의 키워드
		
		// 2. 참조자료형
		// 객체의 주소를 저장하는 자료형
		// 데이터가 저장된 메모리의 영역을 가리킴
		// String, Array, Class ...
		
		// 2.1 문자열 자료형 
	    // - String 키워드
	    // - 쌍따옴표를 이용해서 여러 글자를 저장할 수 있음
        String name = "주미리";

		// 3. 형 변환
		// : byte(1byte), short(2byte), int(4byte), long(8byte)
		
		// 3-1. 강제 형변환(명시적 형변환)
		// 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용
		// 데이터 손실이 발생할 수도 있기 때문에 정확하게 ( )등을 사용해서
		// 손실이 일어나도 괜찮아 ~ 라고 명시해주는 방식
		byte test1 = (byte) 12345;
		System.out.println(test1);
		
		// 3.2 자동 형변환(묵시적 형변환)
		// 작은 크기의 데이터를 큰 크기의 자료형으로 자동 변환
		long test2 = 100;
		long test3 = test1;
		
		
	}

}
