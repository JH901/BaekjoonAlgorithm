package implementation;

import java.util.Scanner;

public class num2960 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int[] numbers = new int[N+1];
		for(int i=0; i<=N; i++) {
			numbers[i] = i;
		}
		
		int count = 0;
		for(int i=2; i<=N; i++) {
			boolean check = false;
			
			if(numbers[i] != 0) {
				for(int j=i; j<=N; j++) {
					if(j%i ==0 && numbers[j] != 0) {
						numbers[j]=0;
						count+=1;
						
						if(count==K) {
							System.out.println(j);
							check=true;
						}
					}
				}
			}
			if(check==true) break;
		}
	}
}
