package 배열실습;

public class Ex07예제복습 {

	public static void main(String[] args) {
		// 1차원 배열 중 두개의 숫자를 뽑아 서로의 거리를 비교한 후
		// 거리가 가장 작은 숫자의 위치(index)를 출력하시오.
		
		int[] point = {92,32,52,9,81,2,68};
		
		int[] result = {0,1};
		
		int dis = 0;
		int dis2 = point[0]-point[1];
		
		if(dis2<0) {
			dis2*=-1;
		}
		
		for(int i=0;i<point.length;i++) {
			for(int j=i+1;j<point.length;j++) { //int j=point.length-1;j>i;j-- 와 같다
				dis = point[i]-point[j];
				if(dis<0) {
					dis*=-1;
				}
				if(dis2>dis) {
					dis2=dis;
					result[0]=i;
					result[1]=j;
				}
			}
		}
		
		System.out.println("result : "+result[0]+", "+result[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
