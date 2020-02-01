package problem;

import java.util.Scanner;

public class num10997 {
	static boolean[][] map;
	static int xEnd;
	static int yEnd;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n==1) {
			System.out.println("*");
			return;
		}
		
		//n==2
		int xSize = 7;
		int ySize = 5;
		
		//n>2
		xSize += (n-2)*4;
		ySize += (n-2)*4;
		
		map = new boolean[xSize][ySize];
		
		xEnd = xSize-(2*n);
		yEnd = ySize-(2*n);
		
		move(0,ySize-1,0);
		
		for(int i=0; i<xSize; i++) {
			for(int j=0; j<ySize; j++) {
				if(map[i][j])System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}

	private static void move(int x, int y, int d) {
		if(x==xEnd && y==yEnd) {
			return;
		}
		//0: r, 1: l, 2: u, 3: d
		int[] xy = new int[2];
		switch(d) {
		case 0:
			System.out.println("r");
			xy =moveR(x,y);
			d = 3;
			break;
		case 1:
			System.out.println("l");
			xy =moveL(x,y);
			d = 2;
			break;
		case 2:
			System.out.println("u");
			xy =moveU(x,y);
			d = 0;
			break;
		case 3:
			System.out.println("d");
			xy =moveD(x,y);
			d = 1;
			break;
		}
		System.out.println("===="+xy[0]+"/"+xy[1]+"====");
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[0].length; j++) {
				if(map[i][j])System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		move(xy[0],xy[1],d);		
	}

	private static int[] moveD(int x, int y) {
		int[] xy = new int[2];
		while(true) {
			if(x<map.length) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			if(x != map.length-1 && map[x+1][y] == true) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			
			map[x][y] = true;
			x++;			
		}
		
	}

	private static int[] moveU(int x, int y) {
		int[] xy = new int[2];
		while(true) {
			if(x<0) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			if(x != 0 && map[x-1][y] == true) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			System.out.println(x);
			System.out.println(y);
			map[x][y] = true;
			x--;			
		}
		
	}

	private static int[] moveL(int x, int y) {
		int[] xy = new int[2];
		while(true) {
			if(y>=map[0].length) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			if(y != map[0].length-1 && map[x][y+1] == true) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			
			map[x][y] = true;
			y++;			
		}
		
	}

	private static int[] moveR(int x, int y) {
		int[] xy = new int[2];
		while(true) {
			if(y<0) {
				xy[0] = x;
				xy[1] = y;
				
				return xy;
			}
			if(y != 0 && map[x][y-1] == true) {
				xy[0] = x;
				xy[1] = y;
				return xy;
			}
			
			map[x][y] = true;
			y--;			
		}
		
	}

}
