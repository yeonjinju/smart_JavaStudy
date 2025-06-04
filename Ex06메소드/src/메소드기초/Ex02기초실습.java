package 메소드기초;

public class Ex02기초실습 {

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 15;
        char op = '-';
        
        // 계산 결과 출력
        System.out.println(cal(num1, num2, op));
    }

    // 계산 메서드
    public static int cal(int a, int b, char op) {
        int result = 0;

        // 연산자에 따라 계산 수행
        if (op == '-') {
            result = a - b;
        } else if (op == '+') {
            result = a + b;
        } else if (op == '*') {
            result = a * b;
        } else {
            // 잘못된 연산자가 입력된 경우
            System.out.println("지원되지 않는 연산자입니다.");
        }

        return result;  // 계산된 결과 반환
    }
}
