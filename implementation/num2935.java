package implementation;

import java.util.Scanner;

public class num2935 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String ch = scan.next();
		int b = scan.nextInt();
		
		int sum=0;
		if(ch.equals("+")) {
			sum = a+b;
		}else if(ch.equals("*")){
			sum = a*b;
		}
		
		System.out.println(sum);

	}

}
