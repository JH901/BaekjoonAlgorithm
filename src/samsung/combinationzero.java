package samsung;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//ncm : 1000000 // => n m// => n!/m!(n-m)!
//25 12 =>2
public class combinationzero {
	static Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	static int n, m;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		
		makeMap(m+1);
		
		refindMap(n-m);
		
		long sum=1;
		for(int key: map.keySet()) {
			sum = (long) (sum * Math.pow(key, map.get(key)));
		}
		
		System.out.println(sum);
		
	}
	
	private static void refindMap(int num) {
		if(num==1) return;
		
		int i=2;
		while(num>1) {
			if(num%i==0) {
				if(map.get(i)==null) map.put(i, -1);
				else map.put(i, map.get(i)-1);
				
				num = num/i;
				if(num == 1) break;
			}else {
				i++;
			}
		}
		refindMap(num-1);
		
	}

	private static void makeMap(int num) {
		if(num>n) return;
		
		int i=2;
		while(num>1) {
			if(num%i==0) {
				if(map.get(i)==null) map.put(num, 1);
				else map.put(i, map.get(i)+1);
				
				num = num/i;
				if(num == 1) break;
			}else {
				i++;
			}
		}
		
		makeMap(num+1);
	}

}
