package stack;

import java.io.*;

public class num9012 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(bf.readLine());
		
		String[] result = new String[input];
		for(int i=0; i<input; i++) {
			String row = bf.readLine();
			result[i] = check(row);
		}
		
		for(String r: result) {
			System.out.println(r);
		}

	}
	public static String check(String row) {
		String[] words = row.split("");
		
		int count_r=0;
		int count_l=0;
		
		for(int i=0; i<words.length; i++) {
			if(words[i].equals("(")) count_l++;
			else if(words[i].equals(")")) count_r++;
		}
		
		if(count_l == count_r) return "YES";
		else return "NO";
		
	}

}
