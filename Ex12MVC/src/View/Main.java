package View;

import java.util.ArrayList;
import java.util.Scanner;
import Controller.Controller;
import Model.MemberDTO;

public class Main {
	public static void main(String[] args) {
//		[View]

		/*
		 * Model -> 데이터 처리, DB관련 기능 역할 View -> 사용자에게 시각적으로 보여줄 수 있는 화면을 담당 Controller ->
		 * 사용자의 요청을 전처리해서 Model/View 에 전달하는 다리역할 MVC패턴의 장점 : 확장이 용이, 유지보수 편리
		 * 
		 * 실행순서 1. 사용자 요청 발생(뷰) 2. 뷰 -> 컨트롤러 (요청전달) 3. 컨트롤러 -> 모델(로직실행 요청) 4. 모델 ->
		 * 컨트롤러(응답데이터 전달) 5. 컨트롤러 ->뷰 (사용자에게 표시할 데이터)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Controller control = new Controller();

		System.out.println("메뉴선택>> [1]회원가입 [2]전체회원조회 [3]회원정보수정 [4]회원정보탈퇴 >>");
		int input = sc.nextInt();

		if (input == 1) {
			System.out.println("회원가입");

			System.out.println("ID : ");
			String id = sc.next();
			System.out.println("PW : ");
			String pw = sc.next();
			System.out.println("NAME : ");
			String name = sc.next();
			System.out.println("AGE : ");
			int age = sc.nextInt();

			// controller 에 필요한 정보를 담아서, 로직을 수행하게끔
			// controller 의 con_join의
			int result = control.Con_join(id, pw, name, age);

			// return된 result의 값으로 성공여부를 확인
			if (result > 0) {
				System.out.println("회원가입 성공");
			} else {
				System.out.println("회원가입 실패");
			}
		} else if (input == 2) {
			// 전체회원조회
			System.out.println("===전체회원===");
			System.out.println("ID\t이름\t나이");
			// Con_list"()" 매개변수를 채우지않고 메소드로 처리
			ArrayList<MemberDTO> result = control.Con_list();

			for (int i = 0; i < result.size(); i++) {
				/*
				 * result == memberDTO가 여러개 묶여있는 ArrayList get(i) == result에서 i번째에 있는
				 * MemberDTO형태의 객체를 가져와 getId() == MemberDTO 객체 안에 있는 데이터들(id, pw, name, age)
				 * private로 막았기 때문에 따로 만들어둔 getId()로 리턴받아서 사용
				 */
				System.out.println(
						result.get(i).getId() + "\t" + result.get(i).getName() + "\t" + result.get(i).getAge() + "\t");
			}
		} else if(input == 3) {
			System.out.println("===정보수정===");
			// 아이디, 비번을 입력하면 그에 맞는 회원의 이름 수정
			System.out.print("ID");
			String id = sc.next();
			System.out.println("PW");
			String pw = sc.next();
			System.out.println("Name");
			String name = sc.next();
			int result = control.Con_update(id, pw, name);
			
			if(result>0) {
				System.out.println("정보수정 성공");
			}else {
				System.out.println("정보수정 실패");
			}
		}else if(input == 4) {
			// 회원탈퇴
			System.out.println("ID");
			String id = sc.next();
			System.out.println("PW");
			String pw = sc.next();
			System.out.println("NAME");
			String name = sc.next();
			System.out.println("age");
			int age = sc.nextInt();
			int result = control.Con_delete(id, pw, name, age);
			
			if(result>0) {
				System.out.println("회원탈퇴 성공");
			}else {
				System.out.println("회원탈퇴 실패");
			}
			
			/* 1. 필요한 정보를 담아서 컨트롤러에 요청
			 * 2. 컨트롤러에서 정보를 전처리해서 모델로 요청
			 * 3. 모델에서 정보를 활용해서 기능 수행 -> 성공여부 리턴 (delete는 int형태)
			 * 4. 모델->컨트롤러로 리턴
			 * 5. 컨트롤러 -> 뷰로 최종리턴
			 * 6. 뷰에서 최종 리턴값을 활용한 안내문 -> 회원가입/정보수정/회원탈퇴 로직이 비슷함
			 * 
			 */
		}

	}
}
