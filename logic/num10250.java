package logic;

import java.util.Scanner;

public class num10250 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int testNum = scan.nextInt();
		for(int i=0;i<testNum;i++) {
			int hNum = scan.nextInt();
			int wNum = scan.nextInt();
			int nNum = scan.nextInt();
			
			System.out.println(countRoomNum(hNum,wNum,nNum));
		}
			
	}
	public static String countRoomNum(int h,int w, int n) {
		String roomNum="";
		int count=0;
		int i=0;
		int j=1;
		
		while(true) {
			if(count==n) break;
			count++;
			i++;
			if(i>h) {
				j+=1;
				i=1;
			}
		}
		
		if(j<10) roomNum=i+"0"+j;
		else roomNum=i+""+j;
		
		return roomNum;
	}
}
