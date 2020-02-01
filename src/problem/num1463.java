package problem;

import java.util.Scanner;

public class num1463 {
	
	static int count = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
				
		calculate(input, 0);
		
		System.out.println(count);
		scan.close();
	}
	
	public static void calculate(int x, int c) {

		if(x == 1 && count > c) count = c;
        else if(c > count) return;
		else if(x < 1) return;
		
		if(x % 3 == 0) {
			calculate(x/3, c+1);
		}
		
		if(x % 2 == 0) {
			calculate(x/2, c+1);
		}
		
		calculate(x-1,c+1);
		
	}

}
