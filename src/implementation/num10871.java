package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		List<Integer> A = new ArrayList<Integer>();
		for(int i =0; i<N; i++) {
			int num = scan.nextInt();
			A.add(num);
		}
		
		for(int num : A) {
			if(num < X) System.out.print(num+" ");
		}
	}
}
