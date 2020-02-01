package implementation;

import java.util.Scanner;

public class num3034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		String[] result = new String[n];
		for(int i =0; i<n; i++) {
			int input = scan.nextInt();
			if(input<=w) result[i] = "DA";
			else if(input <= h) result[i] = "DA";
			else if(input*input <= (w*w)+(h*h)) result[i] = "DA";
			else result[i] = "NE";
		}
		
		for(String s : result) {
			System.out.println(s);
		}

	}

}
