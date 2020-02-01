package For;

import java.util.Scanner;

public class num11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int input = scan.nextInt();
		
		
		int sum = 0;
		for(int i=1; i<=count; i++) {
			
			sum += input %  10;
			input = input /  10;
		}
		System.out.println(sum);
		
		
	}
}
