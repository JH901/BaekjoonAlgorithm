package implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class num2822 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<Integer,Integer> score = new HashMap<Integer, Integer>();
		int[] rank = new int[8];
		for(int i=0; i<8; i++) {
			rank[i] = scan.nextInt();
			score.put(i, rank[i]);
		}
		
		Arrays.sort(rank);
		
		int sum=0, k=0;
		int result[] = new int[5];
		
		while(k < 5) {
			for(int i=7; i>=3; i--) {
				for(int j : score.keySet()) {
					if(rank[i]==score.get(j)) {
						sum+=score.get(j);
						result[k] = j;
						k++;
						break;
					}
				}
			}
		}
		System.out.println(sum);
		Arrays.sort(result);
		for(int i: result) {
			System.out.print((i+1)+" ");
		}
		
	}

}
