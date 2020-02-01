package problem;

import java.util.Scanner;

public class num10991 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star =1;
		int frontEmpty = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<frontEmpty; j++) {
				 System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			
			frontEmpty--;
			star++;
			System.out.println();
		}

	}

}
