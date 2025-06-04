package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
// [Dao] -> Database Access Object (DB에 접근할 수 있는 객체)

	// 여러 메소드에서 재사용하기위해서 메소드 바깥쪽에 선언
	Connection conn = null; // DB연결
	PreparedStatement psmt = null; // SQL구문 셋팅,실행
	ResultSet rs = null; // 리턴되는 테이블형태 결과저장
	int result = 0; // 리턴되는 int 형태 결과저장

	public void getConn() {
		try { // 드라이버로딩, DB정보를 가지고 접속
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DB연결에 필요한 설정값
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void close() { // 객체를 반납할수있는 메소드
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int join(MemberDTO dto) {
		// DB접근
		getConn();
		// DB쿼리문 실행
		String sql = "INSERT INTO DATADESIGNMEMBER VALUES(?, ?, ?, ?, 0)";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			result = psmt.executeUpdate(); // 실행

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(); // 도구반납
		}
		return result;
	}

	public ArrayList<MemberDTO> list() {
		ArrayList<MemberDTO> resultList = new ArrayList<MemberDTO>();
		getConn();

		// 샘플쿼리준비 -> 샘플쿼리 장착 -> (?)채우기 -> 실행메소드
		String sql = "SELECT ID, NAME, AGE FROM DESIGNMEMBER";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			// ResultSet 형태의 결과물을 ArrayList<>타입 데이터로 변환
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				resultList.add(new MemberDTO(id, name, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultList;
	}

	public int update(MemberDTO dto) {
		getConn();
		String sql = "UPDATE DATADESIGNMEMBER SET NAME=? WHERE ID=? AND PW=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			result = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	public int delete(MemberDTO dto) {
		getConn();
		// 조건에 맞는 회원을 삭제하는 쿼리
		String sql = "DELETE FROM DATADESIGNMEMBER WHERE ID=? AND PW=? AND NAME=? AND AGE=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());

			// 실행 후 삭제된 행의 수를 리턴
			result = psmt.executeUpdate(); // 삭제된 행이 있으면 result > 0
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

}
