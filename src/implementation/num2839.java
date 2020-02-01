package implementation;

import java.util.Scanner;

public class num2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int count = 0, count2 = 0,count3 = 0;
		
		if(N%3==0) {
			count2 = N/3;
		}
		
		while(N >= 3) {
			if(N >=5) {
				count +=1;
				N -=5;
				if(N!=3 && N%3==0) {
					count3 = count+N/3;
					N=0;
				}
			}else {
				if(N>=3) {
					count +=1;
					N -=3;
				}else break;
			}
		}
		if(count3 ==0 || N!=0) {
			if(N != 0) count+=1;
			if(count < count2 || count2 ==0) {
					if(N !=0) System.out.println("-1");
					else System.out.println(count);
			}else {
				System.out.println(count2);
			}
		}else {
			System.out.println(count3);
		}
	}
}
