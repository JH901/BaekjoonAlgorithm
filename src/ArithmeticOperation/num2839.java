package ArithmeticOperation;

import java.util.Scanner;

public class num2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int num1=0,num2=0;
		
		if(N>=5) {
			num1 = N/5;
			
			if(N%5!=0 && N%5>=3) {
				num2 = (N%5)/3;
				if((N%5)%3!=0) System.out.println("-1");
				
			}else System.out.println("-1");
			System.out.println(num1+num2);
			
		}else {
			num2 = N/3;
			
			if(N%3==0) System.out.println("-1");
			System.out.println(num1+num2);
		}

	}

}
