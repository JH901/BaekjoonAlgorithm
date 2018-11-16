package implementation;

import java.util.Scanner;

public class num5532 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int count=0;
		while(true) {
			count +=1;
			a -=c;
			b -=d;			
			
			if(a<=0 && b<=0) break;
		}
		System.out.println(l-count);
	}
}
