package problem;

import java.util.Scanner;

public class num2446 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int empty =0; 
		int star = 2*n -1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<empty; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			empty++;
			star-=2;
		}
		empty -=2;
		star +=4;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<empty;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			empty--;
			star+=2;
		}

	}

}
