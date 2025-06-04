package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. id, pw 입력받아서
        System.out.print("ID 입력: ");
        String id = sc.next();
        System.out.print("pw 입력: ");
        String pw = sc.next();
        
        Connection conn = null;
        PreparedStatement psmt = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // DB연결통로 열기(url, user, pw)
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "hr";
            String password = "hr";
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("연결 성공");
            } else {
                System.out.println("연결 실패");
            }

            // 삭제 쿼리 준비
            String sql = "DELETE FROM DATADESIGNMEMBER WHERE ID=? AND PW=?";
            psmt = conn.prepareStatement(sql);

            // ? 자리에 값을 채워줍니다
            psmt.setString(1, id);
            psmt.setString(2, pw);

            // SQL 실행 (executeUpdate()는 삭제된 행의 수를 반환)
            int result = psmt.executeUpdate();

            // 삭제된 행이 있을 경우
            if (result > 0) {
                System.out.println("삭제 완료되었습니다.");
            } else {
                System.out.println("삭제 실패: 해당 ID와 PW로 일치하는 회원이 없습니다.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (psmt != null) psmt.close();
                if (conn != null) conn.close();
                if (sc != null) sc.close(); // Scanner 객체를 닫습니다. 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
