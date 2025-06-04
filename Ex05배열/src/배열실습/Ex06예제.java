package 배열실습;

public class Ex06예제 {

	public static void main(String[] args) {
		// 1차원 배열 중 두개의 숫자를 뽑아 서로의 거리를 비교한 후
		// 거리가 가장 작은 숫자의 위치(index)를 출력하시오.
		
		int[] point = {92,32,52,9,81,2,68};
		int[] result = {0,1};
		int leng = 0;
		int leng2 = point[0]-point[1];
		
		if(leng2<0) {
			leng *= -1;
		}
		
		for(int i=0;i<point.length;i++) {
			for(int j=i+1;j<point.length;j++) {
				if(i!=j) {
				leng=point[i]-point[j];
				if(leng<0) {
					leng*=-1;
				}
				if(leng2>leng) {
					leng2=leng;
					result [0] = i;
					result [1] = j;
					
				}
				} 
			}
		} System.out.println("result : " + result[0] + ", " + result[1]);
		
		
		
		
		
		
		
		
		
	}

}
