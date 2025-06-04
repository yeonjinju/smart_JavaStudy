package 상속기초;

public class Main {
	public static void main(String[] args) {
		// 1. Parent, Child 자료형 p객체 생성
		Parent p = new Parent();
		Child c = new Child();
		
		p.makebibim();
		c.makebibim();
		
		/* 상속의 특징
		 * - 다중상속이 불가 
		 * - 상속의 횟수에 제한이 없음
		 * - 모든 클래스는 Object(최상위클래스)를 상속받는다
		 * -> Object == 클래스 공통의 조상
		 */
		
		/* 객체의 Casting(형변환)
		 * Reference Type 에서의 형변환은 반드시 상속이 전제되어 있어야 한다.
		 * 객체 내 필드, 메소드의 접근권한을 기준으로 강제 vs 자동결정!
		 * 
		 * 1) UpCasting(업캐스팅)
		 * - 자식(서브, 하위)클래스가 부모(슈퍼, 상위)클래스 타입으로 자동 형변환 하는것
		 * ex) 강아지는 동물이다 -> O 자동으로 형 변환
		 *     모든 동물은 강아지다 -> X
		*/
		
		// 부모자료형 변수명 = new 자식자료형();
		Parent p2 = new Child();
		p2.makebibim();
		
		// 2) DownCasting (다운캐스팅)
		// - 업캐스팅 된 객체를 강제 형변환으로 본래의 자료형태로 되돌려놓는것
		Child c2 = (Child)p2;
		
	}

}
