package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex06Dama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// DB드라이버 로드 (최초 1회 실행)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// DB연결에 필요한 설정값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		while (true) {
			System.out.println("메뉴 [1]다마고치 생성 [2]다마고치 키우기");
			int select = sc.nextInt();
			if (select == 1) {// 다마고치 생성
				System.out.println("이름입력:");
				String name = sc.next();
				System.out.println("좋아하는음식 입력:");
				String food = sc.next();

				// 1. DB작업
				try {
					// 작업할때마다 새로운 conn 생성
					conn = DriverManager.getConnection(url, user, password);

					// 다마고치 생성 정보
					String sql = "INSERT INTO DAMA VALUES(?,?,30,30)";
					psmt = conn.prepareStatement(sql);

					// ?채우기
					psmt.setString(1, name);
					psmt.setString(2, food);

					// sql 실행
					int result = psmt.executeUpdate();

					if (result > 0) {
						System.out.println("다마고치 생성 성공 ~");
					} else {
						System.out.println("다마고치 생성 실패 ㅠㅠ");
					}

				} catch (SQLException e) {
					e.printStackTrace();
				}

			} else if (select == 2) { // 다마고치 키우기
				System.out.println("메뉴 [1]상태확인 [2]밥주기 [3]재우기 >>");
				int select2 = sc.nextInt();

				if (select2 == 1) {// 상태확인 선택
					// 내가 만든 모든 다마고치의 상태를 볼 수 있게
					try {
						conn = DriverManager.getConnection(url, user, password);
						String sql = "SELECT * FROM DAMA";
						psmt = conn.prepareStatement(sql);
						rs = psmt.executeQuery();

						System.out.println("NAME \t FOOD \t HUNGRY \t SLEEPY");

						while (rs.next()) {
							String damaName = rs.getString("name");
							String damaFood = rs.getString("food");
							String damaHungry = rs.getString("hungry");
							String damaSleepy = rs.getString("sleepy");
							System.out.println(damaName + "\t" + damaFood + "\t" + damaHungry + "\t" + damaSleepy);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (select == 2) {// 밥주기 선택
					// 1. 다마고치의 이름과 어떤 음식을 줄지를 입력받기
					System.out.print("밥을 제공할 다마고치의 이름을 입력 하세요 : ");
					String damaName = sc.next();
					System.out.print("다마고치에게 제공할 음식을 입력하세요 : ");
					String damaFood = sc.next();

					// 2. 1에서 입력한 이름이 있는지 검사
					try {
						conn = DriverManager.getConnection(url, user, password);
						String sql = "UPDATE DAMA SET HUNGRY = HUNGRY -5 WHERE NAME = ?";
						psmt = conn.prepareStatement(sql);
						psmt.setString(1, damaName);

						int feedResult = psmt.executeUpdate();
						// 3. 밥주기 완료 !
						if (feedResult > 0) {
							// 4. 배고픔을 -5 시키기 (심화)
							System.out.println(damaName + "에게 " + damaFood + "주기 성공 ~");

						} else {
							System.out.println("잘못된 입력값입니다.");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}