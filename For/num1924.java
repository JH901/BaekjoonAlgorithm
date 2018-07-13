package For;

import java.util.Scanner;

public class num1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day =  scan.nextInt();
		
		int count =1;
		for(int i = 1; i <= month; i++) {
			for(int j = 1; j <= monthDate(i); j++) {
				if(count == 8) count =1;
				if(i==month & j ==day) System.out.println(dayName(count));
				count +=1;
			}
		}
		
		
	}
	static int monthDate(int month) {
		int day = 0;
		
		if(month == 2) day = 28;
		else if(month == 4 || month == 6 || month == 9|| month == 11) day = 30;
		else day = 31;
		
		return day;	
	}
	static String dayName(int count) {
		String name = null;
		if(count==1) name = "MON";
		else if(count==2) name = "TUE";
		else if(count==3) name = "WED";
		else if(count==4) name = "THU";
		else if(count==5) name = "FRI";
		else if(count==6) name = "SAT";
		else if(count==7) name = "SUN";
		
		return name;
	}
}
