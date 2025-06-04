package 배열실습;

public class Ex08짝꿍예제 {

	public static void main(String[] args) {
		// 두 개의 숫자를 뽑아 서로의 거리를 비교한 후 차이가 가장 큰 숫자의 인덱스를 출력하시오.
		// 옆의 수와의 계산은 X, 칸 2부터는 거리의 값에 +1, 칸 3은 +2 ...
		
		
		int[] num = {92,32,52,81,9,2,68};
			
		int[] result = {0,2};
		
		int dis = 0;
		int dis2 = num[0] - num[2];
		
		if(dis2<0) {
			dis2*=-1;
		}
		dis2 += 1;
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+2; j<num.length; j++) {
				dis = num[i]-num[j];
				if(dis<0) {
					dis*=-1;
				} dis=dis+j-i-1;
				
				if(dis2<dis) {
					dis2=dis;
					result[0]=i;
					result[1]=j;
				}
			}
		}
		System.out.println("result : " + result[0] + ", " + result[1]);
		
		
		


	}

}
