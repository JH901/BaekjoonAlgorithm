package simulation;

import java.util.Scanner;

public class num1094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int count=0;
		int size = 64;
		while(true) {
			if(input > size) {
				input -= size;
				count ++;
			}else if(input == size) {
				count++;
				break;
			}else {
				size=size/2;
			}
			
		}
		System.out.println(count);

	}

}
