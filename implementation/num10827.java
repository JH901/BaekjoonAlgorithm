package implementation;

import java.util.Scanner;

public class num10827 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result =1;
		for(int i=input; i>0; i--) {
			result = result * i;
		}
		System.out.println(result);
	}

}
