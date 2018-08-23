package logic;

import java.util.Scanner;

public class num2292 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int count = 1;
		int range1 = 1;
		int range2 = 1;

		int i = 0;
		
		if(input >1) {
			while(true) {
				count ++;
				i++;
				range2 += 6*i;

				if(range1<input && input<=range2) break;
				
				range1 = range2;
			}
		}
		System.out.println(count);

	}
}
