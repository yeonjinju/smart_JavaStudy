package Controller;

import java.util.ArrayList;

import Model.MemberDAO;
import Model.MemberDTO;

public class Controller {
//	[Controller]
	/*
	 * 사용자의 요청에 따라서 그에맞는 DB로직을 실행 dao : DB연결, 쿼리문 실행 메소드
	 * 
	 * 1. DB연결 -> DB연결에 대한 정보가 담겨있는 객체를 부름 2. DB로직 실행 ->
	 * 
	 */
	MemberDAO dao = new MemberDAO(); // join()의 리턴데이터
	int result = 0; // list()의 리턴데이터
	ArrayList<MemberDTO> resultList = new ArrayList<MemberDTO>();
	int resultDelete = 0;
	
	public int Con_join(String id, String pw, String name, int age) {
		// 전달해야 하는 데이터를 하나의 묶음으로 만들어서(객체 생성)
		MemberDTO dto = new MemberDTO(id, pw, name, age);
		result = dao.join(dto);
		return result;
	}

	public ArrayList<MemberDTO> Con_list() {
		resultList = dao.list();
		return resultList;
	}

	public int Con_update(String id, String pw, String name) {
		// Con_join처럼 생성자 메소드로 데이터를 담아도 되지만, setter메소드를 사용해보기
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);

		result = dao.update(dto);
		return result;
	}

	public int Con_delete(String id, String pw, String name, int age) {
		MemberDTO dto = new MemberDTO(id, pw, name, age);
		resultDelete = dao.delete(dto);
		return resultDelete;
	}
}