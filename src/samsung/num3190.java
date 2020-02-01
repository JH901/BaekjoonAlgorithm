package samsung;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class num3190 {
	static int n;
	
	static Map<Integer,String> change = new HashMap<>();
	static boolean[][] map;
	static boolean[][] apple;
	static Queue<Integer> tail = new LinkedList<>();
	
	static int time=0;
	static char direction='r';
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int k = scan.nextInt();
		
		map = new boolean[n][n];
		apple = new boolean[n][n];
		
		int x, y;
		for(int i=0; i<k; i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			
			apple[x-1][y-1] = true;
		}
		
		int l = scan.nextInt();
		
		String c;
		for(int i=0; i<l; i++) {
			x = scan.nextInt();
			c = scan.next();
			
			change.put(x, c);
		}
		
		//first position 
		x=0; y=0;
		
		//first head position
		int head = x*100 + y;
		
		//first tail position
		tail.add(head);
		
		map[x][y] = true;
		move(head);
		
		System.out.println(time);
		
		
	}

	private static void move(int head) {
				
		int t = tail.peek();
		
		int t_x = t/100;
		int t_y = t%100;
		
		int x = head/100;
		int y = head%100;
		
		time ++;
		
		switch(direction) {
			case 'u':
				if(x == 0) return;
				else if(map[x -1][y]) return;
				else {
					x -= 1;
					
					if(!apple[x][y]) {
						map[t_x][t_y] = false;
						tail.poll();
					}else apple[x][y] = false;					
				}
				
				if(change.get(time)!= null) {
					if(change.get(time).equals("D")) direction='r';
					else if(change.get(time).equals("L")) direction='l';
				}
				break;
				
			case 'd':
				if(x == n-1) return;
				else if(map[x+1][y]) return;
				else {
					x += 1;		
					
					if(!apple[x][y]) {
						map[t_x][t_y] = false;
						tail.poll();
					}else apple[x][y] = false;							
				}
				
				if(change.get(time)!= null) {
					if(change.get(time).equals("D")) direction='l';
					else if(change.get(time).equals("L")) direction='r';
				}
				break;
				
			case 'r':
				if(y == n-1) return;
				else if(map[x][y+1]) return;
				else {
					y += 1;
					
					if(!apple[x][y]) {
						map[t_x][t_y] = false;
						tail.poll();
					}else apple[x][y] = false;							
				}
				
				if(change.get(time)!= null) {
					if(change.get(time).equals("D")) direction='d';
					else if(change.get(time).equals("L")) direction='u';
				}
				break;
				
			case 'l':
				if(y == 0) return;
				else if(map[x][y-1]) return;
				else {
					y -= 1;
					
					if(!apple[x][y]) {
						map[t_x][t_y] = false;
						tail.poll();
					}else apple[x][y] = false;							
				}
				
				if(change.get(time)!= null) {
					if(change.get(time).equals("D")) direction='u';
					else if(change.get(time).equals("L")) direction='d';
				}
				break;
		}
		
		head = x*100 + y;
		tail.add(head);
				
		map[x][y] = true;
		move(head);
		
	}
}
