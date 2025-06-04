package 인터페이스;

import 추상클래스.Employee;

public class Main {

	public static void main(String[] args) {
		// 인터페이스도 객체생성이 가능할까?
		// -> 익명의 내부 자료형태(안드로이드에서 많이사용)로는 객체생성이 가능함
		// -> But, 일반적인 형태로 객체생성은 불가능함
		Temp t = new Temp() {
			
			@Override
			public void temp() {
				
			}
		};
	}

}
