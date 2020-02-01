package implementation;

import java.util.Scanner;

public class num2490 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] result = new String[3];
		for(int i=0; i<3; i++) {
			int count = 0;
			for(int j=0; j<4; j++) {
				int input = scan.nextInt();
				if(input == 1) count++;
			}
			switch(count) {
			case 0:
				result[i] ="D";
				break;
			case 1:
				result[i] ="C";
				break;	
			case 2:
				result[i] ="B";
				break;	
			case 3:
				result[i] ="A";
				break;	
			case 4:
				result[i] ="E";
				break;	
				
			}
		}
		
		for(String s :result) {
			System.out.println(s);
		}
	}
}
