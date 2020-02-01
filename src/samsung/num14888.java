package samsung;

import java.util.Scanner;

public class num14888 {
	static int n;
	static int[] number;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		number = new int[n];
		
		for(int i=0; i<n;  i++) {
			number[i] = scan.nextInt();
		}
		
		//0 : +, 1 : -, 2 : *, 3 : /
		int[] calculate = new int[4];
		for(int i=0; i<4; i++) {
			calculate[i] = scan.nextInt();
		}
		
		cal(number[0],1,calculate);
		
		
		System.out.println(max);
		System.out.println(min);

	}
	
	public static void cal(int sum, int index, int[] calculate) {
		if(index==n) {
			min = Math.min(min, sum);
			max = Math.max(max, sum);
			return;
		}
		
		// + 
		if(calculate[0] > 0) {
			
			calculate[0]-=1;
	
			cal(sum+number[index],index+1,calculate);
			
			calculate[0]+=1;
		}
		// -
		if(calculate[1] > 0) {

			calculate[1]-=1;
			
			cal(sum-number[index],index+1,calculate);
			
			calculate[1]+=1;
		}
		// *
		if(calculate[2] > 0) {
			calculate[2]-=1;
			
			cal(sum*number[index],index+1,calculate);
			
			calculate[2]+=1;
		}
		// /
		if(calculate[3] > 0) {
			if(sum <0) {
				sum *=-1;
				sum = sum/number[index] *(-1);
			}else {
				sum /= number[index];
			}
			calculate[3]-=1;
			
			cal(sum,index+1,calculate);
			
			calculate[3]+=1;
		}
		
		
	}

}
