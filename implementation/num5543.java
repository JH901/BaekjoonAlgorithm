package implementation;

import java.util.Scanner;

public class num5543 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int burger = 2000;
		
		for(int i=0; i<3; i++) {
			int burgerPrice = scan.nextInt();
			if(burgerPrice < burger) burger = burgerPrice;
		}
		
		int beverage = 2000;
		for(int i=0; i<2; i++) {
			int beveragePrice = scan.nextInt();
			if(beveragePrice < beverage) beverage = beveragePrice;
		}
		
		int setPrice = (burger+beverage)-50;
		System.out.println(setPrice);
		
	}

}
