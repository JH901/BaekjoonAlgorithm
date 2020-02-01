package sk;

import java.util.Scanner;

public class num6603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n == 0) break;
			
			String input = scan.nextLine();
			String[] number = input.split(" ");
			
			int[] num = new int[number.length];
			
			for(int i=0; i<number.length;i++) {
				num[i] = Integer.parseInt(number[i]);
			}
			
		}

	}

}
