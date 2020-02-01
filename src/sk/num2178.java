package sk;

import java.util.Scanner;

public class num2178 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] map = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String[] row = scan.nextLine().split("");
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		int min = m*n;
		min = search(map, n, m, min);

	}
	public static int search(int[][] map, int n, int m, int min) {

		
		return min;
	}

}
