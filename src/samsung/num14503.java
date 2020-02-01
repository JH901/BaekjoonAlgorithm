package samsung;

import java.util.Scanner;

public class num14503 {

	static int n, m;
	static int[][] map;
	static int d;
	static int count = 0;
	static int findPlaceCount=0;
	static int c =2;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		map = new int[n][m];

		int r = scan.nextInt();
		int c = scan.nextInt();
		d = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scan.nextInt();
			}
		}

		clean(r, c);

		System.out.println(count);

	}

	private static void clean(int x, int y) {
		
		//네방향 모두 청소가 이미 되어있거나 벽인경우
		if(findPlaceCount>=4) {
			//d. 뒤 쪽 방향이 벽이라 후진할 수 없는 경우  //c. 바라보는 방향 유지한채로 한칸 후진
			switch (d) {
				case 1: // 동
					if(y == 0 || map[x][y-1]==1) return;
					else y-=1;
					break;
				
				case 3: // 서
					if(y == m-1 || map[x][y+1]==1) return;
					else y+=1;
					break;
				
				case 2: // 남
					if(x == 0 || map[x-1][y]==1) return;
					else x-=1;
					break;
				
				case 0: // 북
					if(x == n-1 || map[x+1][y]==1) return;
					else x+=1;
					break;
			}
			
			findPlaceCount=0;
			clean(x,y);
		}
		
		// 1. 현재 위치를 청소한다.
		if (map[x][y] == 0) {
			map[x][y] = c;
			count++;
			
			c++;
			if(c==60) {
				System.out.println("--------------------------------");
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						if(map[i][j]==1) System.out.print(" @  ");
						else {
							if(map[i][j]<10)System.out.print(" "+map[i][j]+"  ");
							else System.out.print(" "+map[i][j]+" ");
						}
					}
					System.out.println();
				}
			}else if(c>60)System.out.println("?");
			
		}

		// 2. 현재 위치에서 현재 방행을 기준으로 왼쪽 방향으로부터 차례대로 탐색을 진행한다.
		boolean find = false;
		switch (d) {
		case 1: // 동
			// 동쪽에서의 왼쪽 : 북
			d = 0;
			
			//a.왼쪽방향에 청소하지 않은 공간 존재  
			if(x!=0 && map[x-1][y]==0) {
				x-=1;
				find = true;
			}		
			break;
		
		case 3: // 서
			// 서쪽에서의 왼쪽 : 남
			d = 2;
			if(x!=n-1 && map[x+1][y]==0) {
				x+=1;
				find = true;
			}
			break;
		
		case 2: // 남
			// 남쪽에서의 왼쪽: 동
			d = 1;
			if(y!=m-1 && map[x][y+1]==0) {
				y+=1;
				find = true;
			}
			break;
		
		case 0: // 북
			// 북쪽에서의 왼쪽: 서
			d = 3;
			if(y!=0 && map[x][y-1]==0) {
				y-=1;
				find = true;
			}
			break;
		}
		
		//b.왼쪽방향에 청소할 공간 존재x
		if(find) findPlaceCount=0;
		else  findPlaceCount++;
		
		clean(x,y);
	}

}
