package bfs_dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class num1260 {
	static boolean visit[];
	static boolean map[][];
	static int n;
	static Queue<Integer> q = new LinkedList<Integer>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		
		map = new boolean[n][n];
		visit = new boolean[n];
		
		int a, b;
		for(int i=0; i<m; i++) {
			a = scan.nextInt()-1;
			b = scan.nextInt()-1;
			
			map[a][b] = true;
			map[b][a] = true;
		}
		
		dfs(v);
		System.out.println();
		
		for(int i=0; i<n; i++) {
			visit[i] = false;
		}
		
		bfs(v);
		
	}
	public static void dfs(int v) {
		if(!visit[v-1]) {
			visit[v-1] = true;
			
			System.out.print(v+" ");
			
			for(int i=0; i<n; i++) {
				if(map[v-1][i] == true && visit[i]!= true) {
					dfs(i+1);
				}
			}
		}
	}
	public static void bfs(int v) {
		if(!visit[v-1]) {
			visit[v-1] = true;
			System.out.print(v+" ");
			q.add(v);
			int temp;
			while(!q.isEmpty()) {
				temp = q.poll();
				for(int i=0; i<n; i++) {
					if(map[temp-1][i] == true && visit[i]!= true) {
						q.add(i+1);
						visit[i]=true;
						System.out.print((i+1)+" ");
					}
				}
			}
			
			
			if(q.peek() != null) bfs(q.peek());
		}
	}
}
