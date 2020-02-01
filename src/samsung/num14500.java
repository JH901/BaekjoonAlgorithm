package samsung;

import java.util.Scanner;

public class num14500 {
	static int n, m;
	static int[][] map;
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				cal(i,j);
			}
		}
		
		System.out.println(max);
		

	}
	public static void cal(int x, int y) {
		int sum = 0;
		
		//1번째 모형: * * * *
		if(y+3 < m) {
			sum = map[x][y] + map[x][y+1] + map[x][y+2] + map[x][y+3];
			max = Math.max(max, sum);
		}
		
		//1번째 모형
		//	*
		//	*
		//	*
		//	*
		if(x+3 < n) {
			sum = map[x][y] + map[x+1][y] + map[x+2][y] + map[x+3][y];
			max = Math.max(max, sum);
		}
		
		//2번째 모형
		//	* *
		//	* *
		if(x+1 < n && y+1 < m) {
			sum = map[x][y] + map[x+1][y] + map[x][y+1] + map[x+1][y+1];
			max = Math.max(max, sum);
		}
		
		// 3번째 모형
		//	*
		//	*
		//	* *
		if(x+2 < n && y+1 < m) {
			sum = map[x][y] + map[x+1][y] + map[x+2][y] + map[x+2][y+1];
			max = Math.max(max, sum);
		}
		
		//3번째 모형
		//	* * *
		//	*
		if(x+1 < n && y+2 < m) {
			sum = map[x][y] + map[x+1][y] + map[x][y+1] + map[x][y+2];
			max = Math.max(max, sum);
		}
		
		//3번째 모형
		//	* *
		//	  *
		//	  *
		if(x+2 < n && y+1 < m) {
			sum = map[x][y] + map[x][y+1] + map[x+1][y+1] + map[x+2][y+1];
			max = Math.max(max, sum);
		}
		
		//3번째 모형
		//	    *
		//	* * *
		if(x+1 < n && y-2>=0) {
			sum = map[x][y] + map[x+1][y] + map[x+1][y-1] + map[x+1][y-2];
			max = Math.max(max, sum);
		}
		
		//3번째 모형
		//	  *
		//	  *
		//	* *
		if(x+2 < n && y-1 >= 0) {
			sum = map[x][y] + map[x+1][y] + map[x+2][y] + map[x+2][y-1];
			max = Math.max(max, sum);
		}
		//3번째 모형
		//	*
		//	* * *
		if(x+1 < n && y+2 < m) {
			sum = map[x][y] + map[x+1][y] + map[x+1][y+1] + map[x+1][y+2];
			max = Math.max(max, sum);
		}
		
		//3번째 모형
		//	* *
		//	*
		//	*
		if(x+2 < n && y+1 < m) {
			sum = map[x][y] + map[x][y+1] + map[x+1][y] + map[x+2][y];
			max = Math.max(max, sum);
		}
		
		//3번째 모형
		//	* * *
		//	    *
		if(x+1 < n && y+2 < m) {
			sum = map[x][y] + map[x][y+1] + map[x][y+2] + map[x+1][y+2];
			max = Math.max(max, sum);
		}
		
		// 4번째 모형
		//	*
		//	* *
		//	  *
		if(x+2 < n && y+1 < m) {
			sum = map[x][y] + map[x+1][y] + map[x+1][y+1] + map[x+2][y+1];
			max = Math.max(max, sum);
		}
		
		// 4번째 모형
		//	  * *
		//	* *
		if(x+1< n && y-1 >= 0 && y+1 < m) {
			sum = map[x][y] + map[x+1][y-1] + map[x+1][y] + map[x][y+1];
			max = Math.max(max, sum);
		}
		
		// 4번째 모형
		//	  *
		//	* *
		//	*
		if(x+2< n && y-1 >= 0) {
			sum = map[x][y] + map[x+1][y] + map[x+1][y-1] + map[x+2][y-1];
			max = Math.max(max, sum);
		}
		
		
		// 4번째 모형
		//	* *
		//	  * *
		if(x+1 < n && y+2 < m) {
			sum = map[x][y] + map[x][y+1] + map[x+1][y+1] + map[x+1][y+2];
			max = Math.max(max, sum);
		}
		
		//5번째 모형
		//	* * *
		//	  *
		if(x+1 < n && y+2 < m) {
			sum = map[x][y] + map[x][y+1] + map[x][y+2] + map[x+1][y+1];
			max = Math.max(max, sum);
		}
		
		//5번째 모형
		//	  *
		//	* *  
		//    *
		if(x+2 < n && y-1>=0) {
			sum = map[x][y] + map[x+1][y] + map[x+1][y-1] + map[x+2][y];
			max = Math.max(max, sum);
		}
		
		//5번째 모형
		//	  *
		//	* * *
		if(x+1 < n && y-1 >=0 && y+1 < m) {
			sum = map[x][y] + map[x+1][y-1] + map[x+1][y] + map[x+1][y+1];
			max = Math.max(max, sum);
		}
		
		//5번째 모형
		//	*
		//	* *
		//  *
		if(x+2 < n && y+1 < m) {
			sum = map[x][y] + map[x+1][y] + map[x+1][y+1] + map[x+2][y];
			max = Math.max(max, sum);
		}
	}

}
