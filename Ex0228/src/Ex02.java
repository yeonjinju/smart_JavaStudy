
public class Ex02 {

	public static void main(String[] args) {
		// 변수 : 변할 수 있는 수(변하는 데이터를 담을 수 있는 공간)
		
		// 정수형태의 데이터를 담을 수 있는 변수를 선언하겠습니다 (int)
		// 만들어진 변수의 이름을 num이라고 부르겠습니다.
	
		// Java에서의 변수는 같은 이름으로 여러번 변수를 생성할 수 없다
//		int num;
//		num = 10;
		int num = 10;
		
		System.out.println(num+3);
		
		//30을 새로운 변수에 담고 싶습니다
		int number = 30;
		// number 값을 100으로 바꿔주세요
		number = 100;
		
		// String : 문자열
		// " " : 문자열 데이터 사용
		// ' ' : 문자 데이터 사용
		String name;
		name = "승환";
		// 맞는 타입만 데이터로 활용할 수 있다 !
		// name = 30 은 불가능 (30은 문자열 데이터 타입이 아니기 때문에)
		
		// final : 상수 (변하지 않는 데이터) 사용, 이 후에 데이터 못바꿈
		final int age = 20;
		
		// 논리 타입 : boolean (true or false)
		boolean b = false;
		
		// 문자 타입 : char (한글은 아예 사용 안됨)
		char c = 'a';
		System.out.println(c+1); //모든 문자는 아스키코드가 있기 때문에 계산됨
		
		// 실수 타입 : float, double
		double d = 3.14;
		float f = 5.67f; //float은 넣는 데이터 뒤에 f를 붙여야함
		
		
		
		
		
		
	}

}
