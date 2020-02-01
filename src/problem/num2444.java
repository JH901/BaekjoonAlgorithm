package problem;

import java.util.Scanner;

public class num2444 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int count = n-1;
		int star=1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<count; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			count--;
			star +=2;
		}
		count=1;
		star-=4;
		for(int i=0; i<n-1;i++) {
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
