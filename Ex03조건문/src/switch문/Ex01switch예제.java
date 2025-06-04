package switch문;

import java.util.Scanner;

public class Ex01switch예제 {

	public static void main(String[] args) {
		// switch문
		// 어떤 값과 일치하는지를 조건으로 삼을 수 있는 조건문(boolean이 아님)
		// 각각의 case마다 꼭 break를 넣어주기
		
		// 문법
//		switch(boolean이 아닌 식이나 데이터) {
//		case 값1 : 
//			실행문1
//			break;
//		case 값2 :
//			실행문2
//			break;
//		case 값3 :
//			실행문3
//			break;
//		default :
//			모든 case에 다 맞지 않을 경우 - else와 같은 역할
//		}
		
		
		//예문
		
//		int num = 3;
//		
//		switch(num-1) {
//		case 1:
//			System.out.println("1입니다");
//			break;
//		case 2:
//			System.out.println("2입니다");
//			break;
//		default :
//			System.out.println("1도 2도 아닙니다");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 : ");
		int num = sc. nextInt();
		
		switch(num) {
		case 3:
			System.out.println(num + "월은 봄입니다");
			break;
		case 4:
			System.out.println(num + "월은 봄입니다");
			break;
		case 5:
			System.out.println(num + "월은 봄입니다");
			break;
		case 6:
			System.out.println(num + "월은 여름입니다");
			break;
		case 7:
			System.out.println(num + "월은 여름입니다");
			break;
		case 8:
			System.out.println(num + "월은 여름입니다");
			break;
		case 9:
			System.out.println(num + "월은 가을입니다");
			break;
		case 10:
			System.out.println(num + "월은 가을입니다");
			break;
		case 11:
			System.out.println(num + "월은 가을입니다");
			break;
		case 12:
			System.out.println(num + "월은 겨울입니다");
			break;
		case 1:
			System.out.println(num + "월은 겨울입니다");
		case 2:
			System.out.println(num + "월은 겨울입니다");
			break;
		default :
			System.out.println("1~12 사이의 숫자를 입력해주세요.");
		}
		
		// 선생님의 풀이
		System.out.print("월 >> ");
		int month = sc.nextInt();
		
		String season = "";
		
		if(num>12 || num<1) {
			System.out.println("1~12 사이의 숫자를 입력해주세요.");
		} else {
		switch(month) {
		case 1,2,12 :
			season = "겨울";
			break;
		case 3,4,5 :
			season = "봄";
		break;
		case 6,7,8 :
			season = "여름";
		break;
		case 9,10,11 :
			season = "가을";
		break;
		}}
		
		
	}

}
