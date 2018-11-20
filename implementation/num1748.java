package implementation;

import java.util.Scanner;

public class num1748 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count=0;
		for(int i =1; i<=num; i++) {
			String n = String.valueOf(i);
			count+=n.length();
		}
		System.out.println(count);

	}

}
