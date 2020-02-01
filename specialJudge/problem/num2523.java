package problem;

import java.util.Scanner;

public class num2523 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star =1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<star; j++) System.out.print("*");
			star++;
			System.out.println();
		}
		star=n-1;
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<star; j++) System.out.print("*");
			star--;
			System.out.println();
		}

	}

}
