package implementation;

import java.util.Scanner;

public class num10707 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int p = scan.nextInt();
		
		int X_result = 0;
		
		X_result = p*a;
		
		
		int Y_result = 0;
		if(p>c) {
			Y_result = b+((p-c)*d);
		}else {
			Y_result = b;
		}
		
		if(X_result >= Y_result) System.out.println(Y_result);
		else System.out.println(X_result);

	}

}
