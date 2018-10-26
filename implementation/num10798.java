package implementation;

import java.util.Scanner;

public class num10798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] words = new char[5][15];
		
		for(int i=0; i<5; i++) {
			String word = scan.nextLine();
			
			for(int j=0; j<15; j++) {
				if(word.length()>j) words[i][j] = word.charAt(j);
				else words[i][j]='#';
			}
		}

		for(int j=0; j<15; j++) {
			for(int i=0; i<5; i++) {
				if(words[i][j] != '#') System.out.print(words[i][j]);
			}
		}
	}
}
