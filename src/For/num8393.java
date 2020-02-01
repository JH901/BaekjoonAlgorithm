package For;

import java.util.Scanner;

public class num8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=input; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		
	}
}
