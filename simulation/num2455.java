package simulation;

import java.util.Scanner;

public class num2455 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int total = 0;
		for(int i=0; i<4; i++) {
			int out = scan.nextInt();
			int in = scan.nextInt();
			total -= out;
			total += in;
			if(total > max) max = total;
		}
		System.out.println(max);

	}

}
