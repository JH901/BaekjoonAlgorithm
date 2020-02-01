package sk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1152 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String input = bf.readLine().trim().toUpperCase().replaceAll(" ", "0");

		int count = 0;
		char first=' ';

		for(int i=0; i<input.length(); i++) {
			if(i==0) first = input.charAt(0);
			if(i!=0 && input.charAt(i) != '0' && input.charAt(i-1)=='0') {
				count++;
			}
			                     
		}
		
		if((int)first>64 && (int)first<91) count++;
		
		System.out.println(count);
	}

}
