package For;

import java.util.Scanner;

public class num2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		int count = input;
		
		for(int i=1;i<=input;i++) {
			
			for(int j=1; j<=input; j++) {
				if(count>=j)System.out.print("*");
				
			}
			count-=1;
			System.out.println();
		}

	}

}
