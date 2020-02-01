package implementation;

import java.util.Scanner;

public class num5063 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		
		for(int i=0; i<testCase; i++) {
			int r = scan.nextInt();
			int e = scan.nextInt();
			int c = scan.nextInt();
			
			if(r > e-c) {
				System.out.println("do not advertise");
			}else if(r == e-c) {
				System.out.println("does not matter");
			}else {
				System.out.println("advertise");
			}
		}

	}

}
