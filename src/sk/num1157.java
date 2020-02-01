package sk;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class num1157 {

	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String row = bf.readLine();
		
		row = row.toUpperCase();
		
		Map<Object,Integer> map = new HashMap<Object,Integer>();
		for(int i=0; i<row.length(); i++) {
			char c = row.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else map.put(c, 1);
		}
		int max=0;
		boolean check = false;
		Object max_ch = "";
		for(Object ch:  map.keySet()) {
			if(max<map.get(ch)) {
				if(check == true) check = false;
				max = map.get(ch);
				max_ch = ch;
			}
			else if(max == map.get(ch)) check = true;
		}
		
		if(check) System.out.println("?");
		else System.out.println(max_ch);
		
	}

}
