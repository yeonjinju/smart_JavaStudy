package 클래스객체기초;

public class Person {
	/*
	 * Person 이라고 하는 이름의 클래스(설계도)
	 * 사람이 가질 수 있는 데이터와 로직을 설계
	 * 
	 */
	int age;
	String name;
	
	// 로직
	void sleep() {
		System.out.println("졸리니?");
	}
	void introduce() {
		System.out.println("내 이름은 "+name+","+age+"살 입니다.");
	}
	void eat(String food) {
		// 매개변수를 받아와서 실행가능
		System.out.println(name+"이는 "+food+"를 먹습니다.");
	}
	
	void human(String name) {
		System.out.println(name+"입니다.");
	}
	void tall(int t) {
		System.out.println(t+"cm 입니다.");
	}
	void job(String j) {
		System.out.println("직업은 "+j+"입니다.");
	}
}