package problem;

import java.io.*;

public class num1094 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int x  = Integer.parseInt(bf.readLine());
		
		int count=0;
		int size = 64;
		while(true) {
			if(x > size) {
				x -= size;
				count ++;
			}else if(x == size) {
				count++;
				break;
			}else {
				size=size/2;
			}
			
		}
		System.out.println(count);
	}

}
