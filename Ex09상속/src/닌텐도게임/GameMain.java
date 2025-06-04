package 닌텐도게임;

public class GameMain {
	// GameMain 페이지 == 닌텐도 게임기 
	public static void main(String[] args) {
		// 마리오 꺼내오기
		Mario m = new Mario();
		// 게임칩 넣기
		on(m);
		// 젤다,포켓몬 꺼내오기
		Zelda z = new Zelda();
		on(z);
		PokemonGo p = new PokemonGo();
		on(p);
	}
	
	private static void on(Mario m) {
		m.gameStart();
	}
//	메소드 오버로딩 기법으로 풀어내는방법
//	private static void on(Zelda z) {
//		z.gameStart();
//	}
//	private static void on(PokemonGo p) {
//		p.gameStart();
//	}
	
	
	
	
}
