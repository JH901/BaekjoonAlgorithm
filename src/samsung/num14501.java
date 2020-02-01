package samsung;

import java.util.Scanner;

public class num14501 {
	static int max = Integer.MIN_VALUE;
	static int n;
	static int[][] counselor;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		counselor = new int[n][2];
		
		for(int i=0; i<n; i++) {
			counselor[i][0] = scan.nextInt();
			counselor[i][1] = scan.nextInt();
		}
		
		dfs(0,0);
		
		System.out.println(max);

	}
	public static void dfs(int day, int sum) {
		if(day >= n) {
			
			max  = Math.max(max, sum);
			return;
		}else {		
		dfs(day+1,sum);
		
		
		int nextday= day+counselor[day][0];
		if(nextday <= n) {
			sum +=counselor[day][1];
		}
		
		dfs(nextday,sum);
		}
		
	}

}
