package 클래스객체기초;

public class PersonMain {

	public static void main(String[] args) {
		/*
		 * 설계도(class)를 기반으로 객체를 만들어보자
		 * 
		 * 객체 생성하는 법 ↓
		 * 설계도명 객체 = new 설계도명();  
		 * 						 ↑ ()는 생성자 메소드
		 */
		Person p = new Person();
		
		// 객체에 데이터 할당(age, name) - 속성
		p.age = 20;
		p.name = "연땡";
		
		System.out.println(p.age+","+p.name);
		
		// 객체가 가진 기능 실행해보기
		p.sleep();
		p.introduce();
		p.eat("갈비");
		p.eat("콜라도?");
		
		// person설계도를 기반으로 새로운사람 만들어보기
		p.human("이유진");
		p.tall(165);
		p.job("웹 개발자");
		
	}
}


