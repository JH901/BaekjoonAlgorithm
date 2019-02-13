package structure;

import java.util.*;
import java.util.Scanner;

public class num1620 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		Map<Integer,String> list = new HashMap<Integer,String>();

		String name="";
		for(int i =0; i<n; i++) {
			name = scan.next();
			list.put(i+1, name);
		}
		
		Object[] resultList = new Object[m];
		String q = "";
		for(int i=0; i<m; i++) {
			q= scan.next();
			
			if(q.charAt(0)>47 && q.charAt(0)<58) {
				//¼ýÀÚ
				int num = Integer.parseInt(q);
				resultList[i] = list.get(num);
			}else {
				resultList[i] = searchNum(list, q);
			}
		}
		
		for(Object o: resultList) {
			System.out.println(o);
		}

	}
	static int searchNum(Map<Integer,String> list,String q) {
		int num=0;
		String name="";
		for(int i: list.keySet()) {
			name = list.get(i);
			if(name.equals(q)) num = i;
		}
		return num;
	}


}
