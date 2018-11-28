package implementation;

import java.util.Scanner;

public class num5576 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] w = new int[3];
		
		for(int i=0;i<10; i++) {
			int input = scan.nextInt();

			if(w[0]<=input) {
				w[2] = w[1];
				w[1] = w[0];
				w[0] = input;
			}else if(input<w[0] && w[1]<=input) {
				w[2] = w[1];
				w[1] = input;
			}else if(input<w[1] && w[2]<=input) {
				w[2] = input;
			}
		}
		
		
		int[] k = new int[3];
		for(int i=0;i<10; i++) {
			int input = scan.nextInt();
			
			if(k[0]<=input) {
				k[2] = k[1];
				k[1] = k[0];
				k[0] = input;
			}else if(input<k[0] && k[1]<=input) {
				k[2] = k[1];
				k[1] = input;
			}else if(input<k[1] && k[2]<=input) {
				k[2] = input;
			}
		}
		int sum_w=0;
		int sum_k=0;
		for(int i=0; i<3; i++) {
			sum_w += w[i];
			sum_k += k[i];
		}
		
		System.out.println(sum_w+" "+sum_k);
	}

}
