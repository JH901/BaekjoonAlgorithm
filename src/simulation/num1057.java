package simulation;

import java.util.Scanner;

public class num1057 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int n = scan.nextInt();
		int m = scan.nextInt();

		if(n/2 == m/2) System.out.println(n/2);
		else {
			int count = num/2;
			int add = 0;
			int result =count;
			if(num % 2 != 0) add = 1;
			while(true) {		
				System.out.println(count+" / "+result);
				if(n%2 == 0) n = n/2;
				else n = n/2 + 1;
				
				if(m%2 == 0) m = m/2;
				else m = m/2+1;
				
				if(n/2 == m/2) {
					System.out.println("result:"+result);
					break;
				}
				
				if(count %2 ==0) count = count/2;
				else count = count/2+ add;
				
				result += count;
				
				if(count % 2 != 0) add = 1;
				else add = 0;
			}
			
			 
		}
		
	}

}
