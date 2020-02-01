package problem;

import java.util.Scanner;

public class num2443 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int count=0;
		int star = 2*n-1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<count; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
			star -=2;
		}

	}

}
