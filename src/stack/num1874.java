package stack;

import java.io.*;
import java.util.*;

public class num1874 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(bf.readLine());
		
		Stack<Integer> num = new Stack<Integer>();
		int[] stack = new int[input];
		
		for(int i=0; i<input; i++) {
			stack[i] = Integer.parseInt(bf.readLine());
		}
		
		int count=0;
		int n=0;
		List<String> list = new ArrayList<String>();
		while(true) {
			if(num.size()==0 ||(num.lastElement()<stack[n] && count<=stack[n])) {
				count++;
				num.push(count);
				list.add("+");
			}else if(num.lastElement()==stack[n]) {
				num.pop();
				list.add("-");
				n++;
				
			}else {
				list.clear();
				break;
			}
			
			if(n==input) break;
		}
		
		if(list.size()!= 0) {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}else System.out.println("NO");
		
	}

}
