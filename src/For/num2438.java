package For;

import java.util.Scanner;

public class num2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		for(int i = 1;i<=input;i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
}
