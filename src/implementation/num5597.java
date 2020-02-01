package implementation;

import java.util.Scanner;

public class num5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[31];
		for(int i = 1; i<=30;i++) {
			num[i] =i;
		}
		
		for(int i = 0; i<28; i++) {
			int input = scan.nextInt();
			num[input]=0;
		}
		
		for(int i=1;i<=30;i++) {
			if(num[i] != 0) {
				System.out.println(num[i]);
			}
		}

	}

}
