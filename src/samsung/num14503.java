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
		
		//�׹��� ��� û�Ұ� �̹� �Ǿ��ְų� ���ΰ��
		if(findPlaceCount>=4) {
			//d. �� �� ������ ���̶� ������ �� ���� ���  //c. �ٶ󺸴� ���� ������ä�� ��ĭ ����
			switch (d) {
				case 1: // ��
					if(y == 0 || map[x][y-1]==1) return;
					else y-=1;
					break;
				
				case 3: // ��
					if(y == m-1 || map[x][y+1]==1) return;
					else y+=1;
					break;
				
				case 2: // ��
					if(x == 0 || map[x-1][y]==1) return;
					else x-=1;
					break;
				
				case 0: // ��
					if(x == n-1 || map[x+1][y]==1) return;
					else x+=1;
					break;
			}
			
			findPlaceCount=0;
			clean(x,y);
		}
		
		// 1. ���� ��ġ�� û���Ѵ�.
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

		// 2. ���� ��ġ���� ���� ������ �������� ���� �������κ��� ���ʴ�� Ž���� �����Ѵ�.
		boolean find = false;
		switch (d) {
		case 1: // ��
			// ���ʿ����� ���� : ��
			d = 0;
			
			//a.���ʹ��⿡ û������ ���� ���� ����  
			if(x!=0 && map[x-1][y]==0) {
				x-=1;
				find = true;
			}		
			break;
		
		case 3: // ��
			// ���ʿ����� ���� : ��
			d = 2;
			if(x!=n-1 && map[x+1][y]==0) {
				x+=1;
				find = true;
			}
			break;
		
		case 2: // ��
			// ���ʿ����� ����: ��
			d = 1;
			if(y!=m-1 && map[x][y+1]==0) {
				y+=1;
				find = true;
			}
			break;
		
		case 0: // ��
			// ���ʿ����� ����: ��
			d = 3;
			if(y!=0 && map[x][y-1]==0) {
				y-=1;
				find = true;
			}
			break;
		}
		
		//b.���ʹ��⿡ û���� ���� ����x
		if(find) findPlaceCount=0;
		else  findPlaceCount++;
		
		clean(x,y);
	}

}
