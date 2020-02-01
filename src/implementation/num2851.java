package implementation;

import java.util.Scanner;

public class num2851 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score;
		int sum =0;
		for(int i=0;i<10;i++) {
			score = scan.nextInt();
			if(sum + score>=100) {
				if(100-sum>=sum+score-100) {
					System.out.println(sum+score);
					break;
				}else {
					System.out.println(sum);
					break;
				}
			}
		}

	}

}
