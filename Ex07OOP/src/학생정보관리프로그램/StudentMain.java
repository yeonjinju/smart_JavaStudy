package 학생정보관리프로그램;

public class StudentMain {
	public static void main(String[] args) {
		// Student 자료형 st1의 객체 생성
		Student st1 = new Student();
		
		st1.setName("이도연");
		st1.setNumber("20241111");
		st1.setAge(20);
		st1.setScoreJava(50);
		st1.setScoreWeb(90);
		st1.setScoreAndroid(70);
		
		// 이름, 자바점수 출력
		String name = st1.getName();
		System.out.println(name); // 아래 한줄과 같음
		
		System.out.println(st1.getName());
		System.out.println(st1.getScoreJava());
		// 메소드에 커서 올려서 포스트잇 모양에 초록점이 뜨면 자료형이 리턴타입을 의미한다.
		
		// Student 자료형 st2 객체 생성
		// 생성자 생성 후 매개변수 바로 집어넣음
		Student st2 = new Student("신재영", "20252222", 19);
		System.out.println(st2.getName());
		/* new Student() -> 객체를 생성하는 순간에 실행되는 메소드
		 * ****생성자(constructor)****
		 */
		
	}

}
