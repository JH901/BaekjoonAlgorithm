package sk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class num3986 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Stack <String> stack = new Stack<String>();
		
		//좋은 단어 COUNT
		int count=0;
		//입력할 단어 수 만큼 FOR문 반복
		for(int i=0; i<n; i++) {
			String[] row = bf.readLine().trim().split("");
			for(int j=0; j<row.length;j++) {
				stack.add(row[j]);
			}			
		}
		
		for(int) 
		
		System.out.println(count);
	}

}
