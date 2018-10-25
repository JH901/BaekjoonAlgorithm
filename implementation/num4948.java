package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num4948 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input, count = 0;
		List<Integer> nums = new ArrayList<>();
		
		while(true) {
			int inputNum = scan.nextInt();
			if(inputNum != 0) nums.add(inputNum);
			else break;
		}
		
		for(int n : nums) {
			if(n == 1) count = 1;
			else {
				for(int i = n; i < n*2; ++i) {
					boolean check = false;
					for(int j =2; j<i; j++) {
						if(i%j==0) {
							check = true;
							break;
						}					
					}
					if(check == false) count+=1;
				}
			}
			System.out.println(count);
		}
		
		/*while(true) {
			
			count = 0;
			input = scan.nextInt();
			
			if(input == 0) break;
			else if(input ==1) count = 1;
			else {
				boolean check = false;
				for(int i = input+1; i <= input*2; i++ ) {
					check = false;
					for(int j =2; j<i; j++) {
						if(i%j==0) {
							check = true;
							break;
						}					
					}
					if(check == false) count+=1;
				}
			}
			System.out.println(count);
		}*/
	}
}
