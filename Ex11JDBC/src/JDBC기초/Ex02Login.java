package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 사용자로부터 아이디와 비밀번호를 입력받기
        System.out.print("ID 입력:");
        String id = sc.next();
        System.out.print("pw 입력:");
        String pw = sc.next();

        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;

        try {
            // DB연결, 드라이버 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // DB연결통로 열기(url,user,pw)
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "hr";
            String password = "hr";
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("연결성공");
            } else {
                System.out.println("연결실패");
            }

            // sql문 준비
            // 로그인 >> 테이블에 데이터가 존재하는지 확인
            String sql = "SELECT * FROM DATADESIGNMEMBER WHERE ID=? AND PW=?";

            psmt = conn.prepareStatement(sql);

            // ? 인자 채워주기
            psmt.setString(1, id);
            psmt.setString(2, pw);

            // sql문 실행
            rs = psmt.executeQuery();
            // ResultSet이란 -> 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조
            // cursor를 가지고 있다. (처음에는 컬럼명을 가리키고있음), 커서가 가리키고있는 데이터만 가져올수있다

            // rs.next(); -> cursor를 한 행 밑으로 내리는 작업
            if (rs.next() /* == true 생략가능 */) {
                // 로그인 성공
                String uName = rs.getString("name");
                System.out.println(uName + "님 환영합니다.");
            } else {
                System.out.println("로그인이 실패했습니다.");
                System.out.println("ID 및 PW를 다시 입력해주세요.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (psmt != null) psmt.close();
                if (conn != null) conn.close();
                if (sc != null) sc.close(); // Scanner 객체를 닫습니다.
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
