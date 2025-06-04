package Model;

public class MemberDTO {
// [Dto] -> Database Transfer Object (DB로 데이터를 전달하기위해 구조를 짜놓는것)
	private String id;
	private String pw;
	private String name;
	private int age;

	// 회원가입을 위한 생성자 메소드
	public MemberDTO(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	// 값을 담는 생성자 메소드가 존재다면 아무것도 담지않는 기본 생성자 메소드를 만들어야한다
	public MemberDTO() {
		
	}

	// 회원조회를 위한 생성자 메소드
	public MemberDTO(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// Getter -> DTO의 데이터들은 private이기때문에 getter메소드를 사용해야 다른 파일에서 조회가 가능
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	// Setter -> 매개변수로 받은 값을 객체의 데이터에 반영
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
}
