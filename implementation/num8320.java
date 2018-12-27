package implementation;

import java.util.Scanner;

public class num8320 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int result = 0;
		int count = 0;
		for(int i=1; i<input; i++) {
			int sum= (input/i) - count;
			if(sum > 0) result += sum;
			count++;
		}
		System.out.println(result);
	}
}
