package implementation;

import java.util.Scanner;

public class num5565 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalPrice = scan.nextInt();
		
		int sum=0;
		for(int i=0; i<9; i++) {
			sum += scan.nextInt();
		}
		
		int bookPrice = totalPrice - sum;
		System.out.println(bookPrice);
	}
}
