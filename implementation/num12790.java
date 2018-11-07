package implementation;

import java.util.Scanner;

public class num12790 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] results = new int[n];
		for(int i=0; i<n; i++) {
			int hp = scan.nextInt();
			int mp = scan.nextInt();
			int op = scan.nextInt();
			int dp = scan.nextInt();
			int hpT = scan.nextInt();
			int mpT = scan.nextInt();
			int opT = scan.nextInt();
			int dpT = scan.nextInt();
			
			int HP,MP;
			if(hp+hpT<1)HP =1;
			else HP = hp+hpT;
			
			if(mp+mpT<1) MP =1;
			else MP = mp+mpT;
			
			int OP = op+opT;
			int DP = dp+dpT;
			
			int result = 1*HP + 5*MP + 2*OP + 2*DP;
			results[i] = result;
		}
		
		for(int r:results) {
			System.out.println(r);
		}
	}
}
