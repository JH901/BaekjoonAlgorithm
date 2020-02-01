package implementation;

import java.util.Scanner;

public class num5585 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int price = scan.nextInt();
		
		int charge = 1000 - price;
		int count=0;
		while (charge !=0) {
			if(charge >= 500) charge-=500;
			else if(charge < 500 && charge >=100) charge-=100;
			else if(charge < 100 && charge >=50) charge-=50;
			else if(charge < 50 && charge >= 10) charge-=10;
			else if(charge < 10 && charge >= 5) charge-=5;
			else charge-=1;
			
			count +=1;
		}
		System.out.println(count);
	}
}
