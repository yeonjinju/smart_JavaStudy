package 객체배열;

public class Main {

	public static void main(String[] args) {
		// 1. 객체배열 생성
		// 자료형[] 배열이름 = new 자료형[칸수];
		// 포켓몬 자료형을 3개 보관할 수 있는 bag 배열 생성
		Pokemon[] bag = new Pokemon[3];
		
		// 객체 배열의 0번 인덱스에 들어있는 데이터 출력
		System.out.println("bag의 0번방 출력:"+bag[0]);
		
		// 2. 객체 배열의 0번 인덱스에 포켓몬을 넣어보자
		// 이름:피카츄, 타입:전기, 스킬:백만볼트, hp:100, atk:10
		bag[0] = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		System.out.println("bag의 0번방 출력:"+bag[0]);
		System.out.println("bag의 0번방 포켓몬 이름:"+bag[0].getName());
		
		// 3. bag 배열의 1,2 인덱스에도 포켓몬 넣어주기
		// 1번 인덱스 잠만보, 노멀, 누르기, 200, 5
		// 2번 인덱스 망나뇽, 드래곤, 공중날기, 150, 15
		bag[1] = new Pokemon("잠만보", "노멀", "누르기", 200, 5);
		bag[2] = new Pokemon("망나뇽", "드래곤", "공중날기", 150, 15);
		
		System.out.println("이름\t타입\t스킬\t hp \t atk");
		for(int i=0; i<bag.length; i++) { // 0,1,2 출력 하겠지?
			System.out.print(bag[i].getName()+"\t"+bag[i].getType()+"\t"+bag[i].getSkill()+"\t"+bag[i].getHp()+"\t"+bag[i].getAtk());			
			System.out.println("");
			
		}
		// for each 문 -> 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리 -> 배열안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서 :(콜론) 기준 왼쪽에 있는 변수에 담아주는 흐름을 가진다.
		for(Pokemon p : bag) { // (데이터타입 변수명 : 배열 이름)
			System.out.println("");
			System.out.print(p.getName()+"\t"+p.getType()+"\t"+p.getSkill()+"\t"+p.getHp()+"\t"+p.getAtk());				
		}
	}
}






