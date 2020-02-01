package implementation;

import java.util.Scanner;

public class num2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		int h = H;
		int m = M;
		
		if(M >=45) {
			m-=45;
		}else {
			m = 60 - (45-m);
			h-=1;
		}
		
		if(h < 0) {
			h = 24 + h;
		}
		
		System.out.println(h+" "+m);
	}

}
