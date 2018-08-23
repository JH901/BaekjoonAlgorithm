package logic;

import java.util.Scanner;

public class num1475 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int n = num;
		int n1, n2, n3, n4;
		int count=1;

		if (n < 10) {
			n1 = 0;
			n2 = num;
		} else {
			n1 = num / 10;
			n2 = num % 10;
		}

		n3 = n1 + n2; 
		n4 = (n2*10)+n3%10;
		
		if (n4 == num) {
			count = 1;
		} else {
			n = n4;
			
			while (n <= 99 && n >= 0) {
				count+=1;
				if (n < 10) {
					n1 = 0;
					n2 = n;
				} else {
					n1 = n / 10;
					n2 = n % 10;
				}
				n3 = n1 + n2;
				n4 = (n2*10)+n3%10;
				
				if(num == n4) break;
				
				n=n4;
			}

		}
		System.out.println(count);
	}
}
