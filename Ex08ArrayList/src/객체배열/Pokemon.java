package 객체배열;

public class Pokemon {
	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;
	
	// 생성자 생성
	public Pokemon(String name, String type, String skill, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSkill() {
		return skill;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	
	
	

}
