package sk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class num9933 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		String reverse="";
		for(int i=0; i<n; i++) {
			String password = bf.readLine();
			int length = password.length();
			map.put(password, length);
			reverse = new StringBuffer(password).reverse().toString();
			
			if(map.containsKey(reverse)) {
				break;
			}
			
		}

		System.out.println(reverse.length());
		System.out.println(reverse.charAt(reverse.length()/2));
		

	}

}
