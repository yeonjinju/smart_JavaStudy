package 메소드기초;

public class Ex01메소드개요 {

    public static void main(String[] args) {
        /*
         * Method = 계속 꺼내서 쓸 코드의 묶음을 만든다
         * Method 장점 : 코드 재사용이 가능함, 유지보수가 편리해짐
         * 
         * Method 사용법 
         * 1. 메소드 이름();
         * 메소드 만드는법
         * 1. 우리가 지금 주석을 쓰는 공간은 메인메소드 안
         * (메인메소드:코드의 시작점)
         * 메소드안에 메소드를 만드는건 불가능하기때문에 메인메소드 바깥에 추가 메소드를 만들어야함
         */
    	
    	/*
    	 * ★ 메소드 오버로딩(Method overLoading)
    	 *   - 같은 이름의 메소드를 여러개 정의할 수 있음
    	 *   - 기본적으로 메소드명은 중복이 허용되지않지만, 메소드가 가지는 매개변수의 객수나 타입이 다르면 
    	 *     서로다른 메소드라고 인식함
    	 */
    	introduce("안녕하세요");
    	
//    	메소드 사용
        introduce();
        introduce();
        introduce();
        
        /*
         * 매개변수가 있는 메소드 사용
         * 메소드를 정의해둔곳과 똑같이 매개변수의 갯수와 순서를 맞춰야함
         */
        cook(3,"신라면");
        cook(4,"너구리");
        cook(2,"짜파게티");

        /*
         * 반환값이 있는 메소드 사용
         * 반환값으로 변한 메소드 구문을 값으로서 취급이 가능
         */
        int result = sum(1, 4);
        System.out.println("1 + 4 = " + result);
        
        result = sum(10, 40);
        System.out.println("10 + 40 = " + result);
        
        result = sum(15, 45);
        System.out.println("15 + 45 = " + result);
    }

    // 메소드 생성(매개변수x, 반환값x)
    // void == 반환값이 없을때
    public static void introduce() {
        System.out.println("이름 : 연땡");
        System.out.println("나이 : 20");
        System.out.println("취미 : ㅇㅇ");
    }
    
    // 기존 introduce와 이름은 같지만, 매개변수가 달라서 서로다른 별개의 메소드로 인식됨
    public static void introduce(String hello) {
		System.out.println(hello);
	}

    /*
     *  메소드 생성(매개변수o, 반환값x)
     *  매개변수는 소괄호 안쪽에 작성
     * 	여러 매개변수를 넣을수있음
     * 	매개변수의 이름은 메소드 안에서 부를 별명
     */
    public static void cook(int a, String b) {
        System.out.println(b + "을(를)" + a + "개 끓입니다.");
    }

    // 메소드 생성(매개변수x, 반환값o)
    public static int age() {
		System.out.println("age 메소드 실행");
		return 20;
	}
    /*
     * 메소드 생성(매개변수o, 반환값o)
     * 숫자 2개를 매개변수로 받아서 덧셈결과를 리턴하는 메소드
     */
    public static int sum(int a, int b) {
        return a + b;
        
    }
}
