package problem;

import java.util.Scanner;

public class num10995 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		for(int i=0; i<n; i++) {
			if(i%2 != 0) System.out.print(" ");
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
