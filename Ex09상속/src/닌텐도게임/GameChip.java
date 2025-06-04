package 닌텐도게임;

public abstract class GameChip {
	/* abstract == 추상클래스
	 * - 추상메소드를 하나라도 가지괴있다면 반드시 추상클래스가 되어야한다
	 * - abstract 키워드를 사용해 선언한다
	 */
	public void tmp() {
		System.out.println("임의로만든 어쩌구");
	}
	public abstract void gameStart();
	/* 2. 추상메소드
	 * 	- {}가 없는 메소드
	 * 	- 선언(틀: 리턴타입, 매개변수, 메소드명)은 되어있으나 로직이 구현되지 않은 메소드
	 * 	- abstract 키워드를 사용해 선언한다
	*/
}
