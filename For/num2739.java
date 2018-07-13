package For;

import java.util.Scanner;

public class num2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		for(int i = 1;i <= 9; i++) {
			System.out.println(input+" * "+ i +" = "+ (i*input));
		}

	}

}
