package implementation;

import java.util.Scanner;

public class num2563 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] space = new int[100][100];	
		
		int count = scan.nextInt();
		for(int i=0; i<count; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int n=0; n<10; n++) {
				for(int m=0; m<10; m++) {
					space[x+n][y+m]=1;
				}
			}
		}
		
		int sum=0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(space[i][j]==1) sum+=1;
			}
		}
		System.out.println(sum);
	}
}
