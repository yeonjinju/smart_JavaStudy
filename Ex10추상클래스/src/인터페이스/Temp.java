package 인터페이스;

public interface Temp {
	/* Interface -> 클래스들이 "공통으로 구현해야하는 기능(강제성)"들을 미리 정의
	 * -> 프로젝트의 설계도면 or 작업명세서(지켜야하는 규칙)
	 * 
	 * 인터페이스 특징
	 * - 필드에 들어갈 수 있는 데이터는 반드시 상수여야함
	 * - static 키워드가 있는 필드만 선언 가능함
	 * - 필드에서 static 키워드와 final 키워드 생략 가능함
	 * - 추상메소드만 가질 수 있음
	 * - 메소드 선언시 abstract 키워드 생략이 가능
	 * - implements 키워드를 사용해서 상속받을 수 있다.
	 * - interface는 다중상속이 가능함 ex) public abstract class Child extends Employee implements **Temp, Temp2**
	 * 
	 */
	// 1. 필드 
	public int num = 0;
	
	// 2. 메소드 (Abstract methods do not specify a body)
	public void temp();
	
}