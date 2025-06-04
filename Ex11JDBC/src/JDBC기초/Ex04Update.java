package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Update {

   public static void main(String[] args) {
      // id , pw , 수정할 함수
      Scanner sc = new Scanner(System.in);
      System.out.println("======회원 정보 수정 ======");
      System.out.print("ID 입력 : ");
      String id = sc.next();
      System.out.print("PW 입력 : ");
      String pw = sc.next();
      System.out.print("수정할 점수 입력 : ");
      int score = sc.nextInt();
      
      Connection conn = null;
      PreparedStatement psmt = null;
      
   
      try {
         //1. 드라이버 로딩
         Class.forName("oracle.jdbc.driver.OracleDriver");
         // 2. 데이터베이스 연결
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
           String user = "hr";
           String password = "hr";
           conn = DriverManager.getConnection(url, user, password);
         
           if(conn != null) {
              System.out.print("연결 성공!");
           }else {
              System.out.print("연결 실패ㅠㅠ");
           }
           // 3. 쿼리 전송
           String sql = "UPDATE DESIGNMEMBER SET SCORE = ? WHERE ID = ? AND PW = ?";
           
           psmt = conn.prepareStatement(sql);
           
           psmt.setInt(1, score);
           psmt.setString(2, id);
           psmt.setString(3, pw);
          
           int row = psmt.executeUpdate();  
           
            if(row>0) {
                System.out.println("업데이트 성공");
             }else {
                System.out.println("업데이트 실패했습니다..");
                System.out.println("ID나 PW를 다시 확인해주세요.");
             }           
         
      } catch (Exception e) {
         
         e.printStackTrace();
      }finally {
            //위에서 예외상황이 발생하더라도 반드시 한 번은 들어오는 구간
            //6. DB 연결 종려 --> 자원반납
          
            try {
               //자원을 반납할 떄는 사용한 순서의 역순으로 반납한다.
               if(psmt != null)
               psmt.close();
               if(conn != null)
                  conn.close();
               
            } catch (SQLException e) {
               e.printStackTrace();
            }
            
         }
      
      // 4. 결과를 이용한 작업처리
      // 5. 자원반납
      
   
         }
            

   }



