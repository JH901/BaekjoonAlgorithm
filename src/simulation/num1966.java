package simulation;

import java.util.*;

public class num1966 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tc = scan.nextInt();
		
		int n = 0;
		int m = 0;
		Map<Integer, Integer> list = new HashMap<Integer, Integer>();
		int[] result = new int[tc];
		for(int i=0; i<tc; i++) {
			n = scan.nextInt();
			m = scan.nextInt();
			
			int rank = 0;
			for(int j=0; j<n; j++) {
				rank = scan.nextInt();
				list.put(j, rank);
			}
			result[i] = searchRank(list,m);
		}

	}

	private static int searchRank(Map<Integer, Integer> list, int m) {
		int rank = 0;
		int count =0;
		for(int i:list.keySet()) {
			if(list.get(i)>list.get(m)) count++;
		}
		
		for(int i=0; i<count;i++) {
			
		}
		
	
		return rank;
	}

}
