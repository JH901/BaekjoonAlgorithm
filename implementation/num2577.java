package implementation;

import java.util.Scanner;

public class num2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int cal = A*B*C;
		String calString = String.valueOf(cal);
		char[] cS = calString.toCharArray();
		int[] result = new int[10];
		for(char c : cS) {
			switch(c) {
				case '0':
					result[0]+=1;
					break;
				case '1':
					result[1]+=1;
					break;	
				case '2':
					result[2]+=1;
					break;	
				case '3':
					result[3]+=1;
					break;	
				case '4':
					result[4]+=1;
					break;	
				case '5':
					result[5]+=1;
					break;	
				case '6':
					result[6]+=1;
					break;	
				case '7':
					result[7]+=1;
					break;	
				case '8':
					result[8]+=1;
					break;	
				case '9':
					result[9]+=1;
					break;	
			}
		}
		for(int i=0; i<10; i++) {
			System.out.println(result[i]);
		}
	}

}
