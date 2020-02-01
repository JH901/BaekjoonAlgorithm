package implementation;

import java.util.Scanner;

public class num10886 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int result = 0;
		for(int i=0; i<N; i++) {
			int survey = scan.nextInt();
			if(survey == 0) result -=1;
			else result +=1;
		}
		
		if(result >0) System.out.println("Junhee is cute!");
		else System.out.println("Junhee is not cute!");
	}

}
