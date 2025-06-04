package 코테문제;

import java.util.Scanner;

public class Ex03편지 {

	public static void main(String[] args) {
		// 머쓱이는 할머니께 생신 축하 편지를 작성하려고 한다
		// 글자 한 자 한 자를 가로 2cm크기로 적으려고 하며
		// 편지를 가로로만 적을 때, 축하문구 message(String)을 적기 위해
		// 필요한 편지지의 최소 가로길이를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("message : ");
		String m = sc.nextLine();
		
		int leng = m.length();
		
		System.out.println("최소 가로 길이 : "+leng*2);
		

	}

}
