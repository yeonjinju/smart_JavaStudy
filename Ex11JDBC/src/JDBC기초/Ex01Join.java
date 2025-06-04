package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자 입출력 구간
		System.out.print("ID 입력:");
		String id = sc.next();
		System.out.print("pw 입력:");
		String pw = sc.next();
		System.out.print("이름 입력:");
		String name = sc.next();
		System.out.print("나이 입력:");
		int age = sc.nextInt();
		System.out.print("점수 입력:");
		int score = sc.nextInt();
		
		
		/* JDBC(Java Database Connectivity) -> JDBC 인터페이스 사용방법
		 * 1. JDBC드라이버 -> java에서 제공해주는 인터페이스들을 데이터베이스 회사에서 상속을 받아서 로직을 구현한 클래스 파일들의 모음
		 */
		PreparedStatement psmt = null; // 지역변수로 갖춰있어서 밖으로 빼주는 작업
		Connection conn = null;
		try {
			// Try 구문 -> 예외가 발생할수 있지만, 우선시도해보는 구간
			Class.forName("oracle.jdbc.driver.OracleDriver");
			/* 반드시, 프로젝트에 jar파일에 넣어주기
			 * jar -> 클래스 파일들을 여러개 모아놓은 압축파일
			 * 프로젝트 선택 -> 마우스 우클릭 -> build path -> configure build path -> libraries -> class path
			 * 			   -> 우측 add external jars -> 원하는 jar파일경로 선택후 apply and close 
			 */
			
			// 2. DB연결 
			// 준비물 
			// 연결경로
			// JDBC 드라이버가 thin 타입, @localhost -> ip 주소, 1521:port번호, 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 계정이름
			String user = "hr";
			String password = "hr";
				
			// Connection -> 데이터베이스에 접속하기위한 모든 메소드를 가진 인터페이스
			// -> 데이터베이스와 하는 모든 통신은 Connextion을 통해서만 이루어진다
			// Connection == MetaData -> 사용가능한 테이블 목록, 컬럼들에 대한 정보 등 연결된 데이터베이스의 정보들을 전부 가지고있음
			conn = DriverManager.getConnection(url, user, password);
			
			if(conn != null) {
				System.out.println("연결성공");
			}else { 
				System.out.println("연결실패");
			}
			// 3. Query문(SQL구문)전송 /  쿼리문 작성 ↓
			String sql = "INSERT INTO DATADESIGNMEMBER VALUES (?, ?, ?, ?, ?)";
			// ? 인자 -> 사용자로부터 어떤데이터가 들어올지 모를때 사용
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			psmt.setInt(5, score);
			
			// 4. Sql문 실행
			int row = psmt.executeUpdate();
			// executeUpdate() : insert, update, delete 에만 사용한다.
			
			// 5. 결과확인 작업쿼리
			if(row>0) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
			
		} catch (Exception e) {
// 		} catch (ClassNotFoundExceptio  | SQLException e) {
//			-> 모든 예외클래스는 Exception을 상속받는다 -> 업캐스팅이 일어나는 과정
			
			// catch -> 예외가 발생했을때 어떤로직을 수행할지 작성하는 구간
			// catch()안에 있는 매개변수는, 어떤 예외상항을 잡아줄건지 기술하는 공간
			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 났는지 출력해주는 구문 -> 개발할때만 사용하기
			// 배포할때는 삭제하는게 좋음	
		}
		finally {
			// 위에서 예외상황이 발생하더라고 반드시 한번은 들어오는구간
			// 6. DB연결종료 -> 자원반납
				try {
					// 자원을 반납할때는 항상 사용한 순서의 역순으로 반납한다
//	            	psmt는 PreparedStatement 객체이고, 이를 사용한 후 반드시 닫아줘야 합니다. 
//	            	그러나 psmt가 null일 경우 close()를 호출할 수 없으므로 null인지 여부를 확인하는 것입니다.
					if(psmt != null) 
						psmt.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
}
//JOIN, DELETE, LOGIN, UPDATE 순으로 코드리뷰 하기 