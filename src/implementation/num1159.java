package implementation;

import java.util.Scanner;

public class num1159 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		char[] ch = new char[N];
		for(int i=0; i<=N; i++) {
			String name = scan.nextLine();
			ch[i] = name.charAt(0);
		}
		
		String result="";
		for(int i=0; i<N; i++) {
			int count =0;
			if(ch[i] != '0') {
				for(int j=0; j<N; j++) {
					if(ch[i]==ch[j]) {
						count+=1;
						ch[j]='0';
					}
				}
			}
			if(count >=5) result+=ch[i];
		}
		System.out.println(result);
	}

}
