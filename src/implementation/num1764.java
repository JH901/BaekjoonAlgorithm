package implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num1764 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		List<String> canHear = new ArrayList<>();
		List<String> canSee = new ArrayList<>();
		for(int i=0; i<N+M; i++) {
			String input = scan.next();
			if(i<N)	canHear.add(input);
			else canSee.add(input);
		}

		List<String> canLS = new ArrayList<>();
		for(String h: canHear) {
			for(String s: canSee) {
				if(s.equals(h)) canLS.add(s);
			}
		}
		
		System.out.println(canLS.size());
		for(String h: canLS) {
			System.out.println(h);
		}
	}
}
