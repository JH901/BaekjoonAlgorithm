package implementation;

import java.util.Scanner;

public class num8979 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[][] scores = new int[n][4];
		int select=0;
		for(int i=0; i<n; i++) {
			scores[i][0] = scan.nextInt();
			if(scores[i][0] == k) select = i;
			scores[i][1] = scan.nextInt();
			scores[i][2] = scan.nextInt();
			scores[i][3] = scan.nextInt();
		}
		int rank=1;
		for(int i=0; i<n; i++) {
			if(scores[select][1]<scores[i][1]) rank+=1;
			else if(scores[select][1]==scores[i][1]) {
				if(scores[select][2]<scores[i][2]) rank+=1;
				else if(scores[select][2]==scores[i][2]) {
					if(scores[select][3]<scores[i][3]) rank+=1;
				}
			}
		}
		System.out.println(rank);
	}

}
