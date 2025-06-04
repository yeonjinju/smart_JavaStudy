package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05SelectAll {

   public static void main(String[] args) {
      // select * from datadesignmember
      
      Connection conn = null;
      PreparedStatement psmt = null;
      ResultSet rs = null;
      try {
         // 드라이버 로딩
         Class.forName("oracle.jdbc.driver.OracleDriver");

         // DB 연결 통로 열기(url, user, password)
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String user = "hr";
         String password = "hr";
         conn = DriverManager.getConnection(url, user, password);


         // sql문 준비
         String sql = "SELECT * FROM DATADESIGNMEMBER";

         psmt = conn.prepareStatement(sql);

         // sql문 실행
         rs = psmt.executeQuery();
        
         System.out.println("==== 전체 회원 조회 ====");
         System.out.println("Id\t이름\t나이\t점수");

         while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            int score = rs.getInt("score");

            System.out.println(id + "\t" + name + "\t" + age + "\t" + score);
         }


      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         // 열어준 순서의 반대!!!
         try {
            if (rs != null)
               rs.close();
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
