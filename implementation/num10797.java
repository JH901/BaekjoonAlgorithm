package implementation;

import java.util.Scanner;

public class num10797 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int day = scan.nextInt();
		
		int count=0;
		for(int i=0; i<5; i++) {
			int carNum = scan.nextInt();
			if(carNum == day) count+=1;
		}
		System.out.println(count);
	}
}
