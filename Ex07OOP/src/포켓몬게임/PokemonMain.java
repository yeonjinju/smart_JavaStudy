package 포켓몬게임;

import java.util.Scanner;

public class PokemonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 포켓몬 두마리 생성(포켓몬 클래스 기반으로 객체2개 생성)
		 * 피카츄, 전기, 백만볼트, 100, 10
		 * 잠만보, 노멀, 누르기, 200, 5
		 */
		Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 100, 10);
		Pokemon jamman = new Pokemon("잠만보", "노멀", "누르기", 200, 5);
	
		while(true) {
			System.out.println("포켓몬을 선택하세요.");
			System.out.print("[1]피카츄 [2]잠만보 >>");
			int choice = sc.nextInt();
			if(choice ==1) {
	            //피카츄 선택
	            System.out.println("피카츄가 잠만보를 공격합니다.");
	            
				// 사용자가 피카츄를 선택
	            
				// 피카츄가 잠만보를 공격
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반공격 [2]스킬공격 >>");
				int choiceAtk = sc.nextInt();
				if(choiceAtk==1) {
					// 일반공격을 선택했다면 잠만보의 hp를 피카츄의 atk만큼 감소시키기
                    jamman.setHp(jamman.getHp() - pika.getAtk()); // 잠만보 HP 감소
                    
				}else {
					// 스킬공격을 선택했다면 잠만보의 hp를 피카츄의 atk*1.5만큼 감소시키기
					jamman.setHp(jamman.getHp()-(int)(pika.getAtk()*1.5));
				}
				// 두마리 포켓문의 hp출력해주기
				System.out.println("남은 hp >> pika:"+pika.getHp()+", jamman"+jamman.getHp());
			}
            if(choice == 2) {  // 잠만보 선택
                // 잠만보가 피카츄를 공격하는 상황
                System.out.println("잠만보가 피카츄를 공격합니다.");
                
                // 공격 방법 선택
                System.out.println("공격을 선택하세요");
                System.out.print("[1]일반공격 [2]스킬공격 >>");
                int choiceAtk = sc.nextInt();
                
                if(choiceAtk == 1) {
                    // 일반공격을 선택한 경우
                    pika.setHp(pika.getHp() - jamman.getAtk());  // 피카츄 HP 감소
                } else {
                    // 스킬공격을 선택한 경우
                    pika.setHp(pika.getHp() - (int)(jamman.getAtk() * 1.5));  // 피카츄 HP 감소
                }

                // 두 포켓몬의 HP 출력
                System.out.println("남은 HP : 피카츄 >> " + pika.getHp() + ", 잠만보 >> " + jamman.getHp());
            }
            


			//포켓몬 한 마리라도 hp가 0보다 작거나 같을 때 프로그램 종료
            if(pika.getHp() <= 0 || jamman.getHp() <= 0) {
                // 승자 출력
                if(pika.getHp() > jamman.getHp()) {
                    System.out.println("피카츄가 승리했습니다!");
                } else if(jamman.getHp() > pika.getHp()) {
                    System.out.println("잠만보가 승리했습니다!");
                } else {
                    System.out.println("무승부입니다!");
                }
                break; // 게임 종료

		}
	}
	}
}
