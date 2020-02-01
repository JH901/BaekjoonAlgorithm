package sk;

import java.util.Scanner;

public class num3015 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] h = new int[n];
		for(int i=0; i<n; i++) {
			h[i]= scan.nextInt();
		}
		
		int count=0;
		for(int i=0; i<n; i++) {
			int max=0;
			for(int j=i+1; j<n;j++) {
				if(max<=h[j]) {
					count++;
					max=h[j];
					if(h[i]<h[j])break;
				}
			} 
		}
		
		System.out.println(count);
	}	

}
