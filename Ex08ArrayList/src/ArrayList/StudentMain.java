package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {

		// 1. Student 자료형을 보관할 수 있는 sList라는 이름을 가진 ArrayList 생성
		ArrayList<Student> sList = new ArrayList<Student>();
		
		// 2. 데이터 추가(본인이름, 나이를 가지고 있는 데이터를 추가)
		// 생성자 생성 
		
//		Student s1 = new Student("주연진", 27);
//		sList.add(s1);
		sList.add(new Student("주연진", 27));
		
		// 이름출력
		System.out.println(sList.get(0));
		System.out.println(sList.get(0).getName());
		// 본질적으로 어떤 자료형인지 커서 올려서 확인할것
		// sList.get(0) -> return type : Student -> 객체구나 !
		
		// 4. 팀원 데이터 전부 추가하기
		sList.add(new Student("이수현", 00));
		sList.add(new Student("정병오", 00));
		sList.add(new Student("경서님", 98));
		sList.add(new Student("주연진", 97));
		// 5. 팀원 이름, 나이 전부 출력 -> foreach 사용하기
		for(Student	s : sList) {
			System.out.println(s.getName()+s.getAge());
		}
		
	}

}
