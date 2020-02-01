package problem;

import java.util.Scanner;

public class num10990 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int frontEmpty = n - 1;
		int empty = 0;

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < frontEmpty; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			if(i == 0) {
				System.out.println();
				frontEmpty--;
				empty+=1;
				continue;
			}
			
			for(int j = 0; j<empty; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
			
			frontEmpty--;
			empty+=2;
			
		}

	}

}
