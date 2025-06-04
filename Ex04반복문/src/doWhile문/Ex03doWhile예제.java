package doWhile문;

import java.util.Scanner;

public class Ex03doWhile예제 {

	public static void main(String[] args) {
		// 아이디와 비밀번호를 입력 받고, 아래와 일치할 경우
		// "로그인 성공" 일치하지 않을 경우에는 "로그인 실패"를 출력
		// 아이디 : test 비밀번호 : test1234

		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pw = "test1234";
		int count = 0; //로그인 실패 횟수를 센다
		
		
		do {
			System.out.print("ID : ");
			String id2 = sc.next();
			System.out.print("PW : ");
			String pw2 = sc.next();
			
			if (id2.equals(id) && pw2.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				++count;
				if (count==3) {
					System.out.println("3번 이상 틀렸어요");
					break;
				}
			}
		} while(true);
		
		
		
	}

}
