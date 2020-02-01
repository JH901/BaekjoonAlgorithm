package problem;

import java.io.*;
import java.util.*;

public class num2667 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		//�Է¹޾Ƽ� ���������
		int[][] map= new int[n][n]; 
		boolean[][] map_check = new boolean[n][n];
		for(int i = 0; i<n; i++) {
			String row = bf.readLine();
			for(int j=0; j<n; j++) {
				int home = Integer.parseInt(row.substring(j, j+1));
				map[i][j] = home;
				map_check[i][j] = false;
			}
		}
		
		int count=0;	
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(map[i][j]==1 && map_check[i][j]==false) {
					count++;
					int count_home =0;
					count_home = searchHome(n, i, j, map, map_check,count_home);
					list.add(count_home);
				}
			}
		}
		
		System.out.println(count);
		Collections.sort(list);
		for(int i=0; i<count; i++) {
			System.out.println(list.get(i));
		}
		

	}

	private static int searchHome(int n, int x,int y,int map[][],boolean map_check[][],int count_h) {
		count_h++;
		
		map[x][y]=0;
		map_check[x][y]=true;

		//��
		if(y != 0) {
			if(map[x][y-1] ==1 && map_check[x][y-1] == false) {
				count_h=searchHome(n, x,y-1,map,map_check,count_h);
			}
			
		}
		//��
		if(y != n-1) {
			if(map[x][y+1] ==1 && map_check[x][y+1] == false) {
				count_h=searchHome(n, x,y+1,map,map_check,count_h);
			}
			
		}
		//��
		if(x != 0) {
			if(map[x-1][y] ==1 && map_check[x-1][y] == false) {
				count_h=searchHome(n, x-1,y,map,map_check,count_h);
			}
		}
		//��
		if(x != n-1) {
			if(map[x+1][y] ==1 && map_check[x+1][y] == false) {
				count_h=searchHome(n, x+1,y,map,map_check,count_h);
			}
		}
		
		return count_h;
	}

}
