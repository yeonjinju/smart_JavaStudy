package 학생정보관리프로그램;

public class Student {
	// 1. Filed
	private String name; // 이름
	private String number; // 학번
	private int age; // 나이
	private int scoreJava; // Java 점수
	private int scoreWeb; // Web 점수
	private int scoreAndroid; // Android 점수
	
	// 생성자(Constructor) -> 객체를 생성하는 순간에 실행되는 메소드
	// 					 -> 필드에 있는 데이터를 객체를 생성하는 순간에 초기값을 지정
	public Student(String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	/*
	 * Constructor 생성자의 특징
	 * - 리턴타입을 지정조차 하지않는다 (void도 작성 안함)
	 * - 생성자의 이름은 클래스 이름과 동일해야 한다. (대소문자 구분)
	 * - 생성자도 결국 메소드이다. 
	 * - 매개변수가 아무것도 없는 생성자를 기본생성자(default constructor) 라고 부르는데 생략 가능하다.
	 * 	 -> 단, 새로운 생성자를 만들게 되면 기본 생성자는 덮어씌워진다. (사라짐)
	 * - 생성자도 메소드이기 때문에 오버로딩(중복정의)이 가능하다.
	 * 
	 * 오버로딩이란?
	 * - 메소드의 이름과 리턴타입이 동일한 생태에서 매개변수의 개수와 타입을 다르게 "중복으로 정의"하는 메소드 정의기법
	 */
	
	public Student() {
		
	}

	/* 2. Method
	 * 	getter Method -> 클래스 내부에 있는 필드 값을 외부(다른클래스)에서 가져갈 수 있는 메소드
	 * 	setter Method -> 클래스 내부에 있는 필드 값을 외부(다른클래스)에서 수정할 수 있는 메소드
	*/
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(String name) {
		this.number = number;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
}
