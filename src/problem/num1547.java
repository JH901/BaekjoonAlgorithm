package problem;

import java.util.Scanner;

public class num1547 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		
		int containNum = 1;
		
		for(int i = 0; i<m; i++) {
			int x= scan.nextInt();
			int y= scan.nextInt();
			
			if(x == containNum) containNum = y;
			else if(y == containNum) containNum = x;
		}
		
		System.out.println(containNum);

	}

}
