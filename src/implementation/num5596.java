package implementation;

import java.util.Scanner;

public class num5596 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s=0;
		int t=0;
		for(int i=0;i<2;i++) {
			int info = scan.nextInt();
			int math = scan.nextInt();
			int si = scan.nextInt();
			int en = scan.nextInt();
			if(i == 0) s = info+math+si+en;
			else t = info+math+si+en;
		}
		
		if(s>=t) System.out.println(s);
		else System.out.println(t);

	}

}
