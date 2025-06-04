package 코테문제;

public class Ex05예제 {

	public static void main(String[] args) {
		// (77*1)+(76*2)+(75*3)+...+(1*77)
		// 위의 식을 계산하여 결과를 출력하시오

		int i=77;
		int j=1;
		int c=0;
		int sum=0;
		
		while(i>0 || j<78) {
			c = i*j;
			i--;
			j++;
			sum += c;
		} System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
