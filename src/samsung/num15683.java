package samsung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num15683 {
	static List<Integer> list = new ArrayList<Integer>();
	static int min = Integer.MAX_VALUE;
	static int n, m;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		// 지도 그리기
		int[][] map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = scan.nextInt();
				if (map[i][j] != 0 && map[i][j] != 6) {
					list.add((i * 10) + j);
				}
			}
		}
		
		dfs(0, map);

		System.out.println(min);

	}

	public static void dfs(int index, int[][] mapCopy) {
		if (list.size() == index) {
			checkPlace(mapCopy);
			return;
		}

		int num = list.get(index);
		int x = num / 10;
		int y = num % 10;

		int cctv = mapCopy[x][y];

		int[][] copy = clone(mapCopy);
		switch (cctv) {
		case 1:
			// 한방향 ->
			// 상
			copy = up(x, y, copy);
			dfs(index + 1, copy);

			// 하

			copy = clone(mapCopy);
			copy = down(x, y, copy);
			dfs(index + 1, copy);

			// 좌

			copy = clone(mapCopy);
			copy = left(x, y, copy);
			dfs(index + 1, copy);

			// 우

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			dfs(index + 1, copy);

			break;
		case 2:
			// 양방향 <- ->
			// 상하

			copy = clone(mapCopy);
			copy = up(x, y, copy);
			copy = down(x, y, copy);
			dfs(index + 1, copy);

			// 좌우

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			copy = left(x, y, copy);
			dfs(index + 1, copy);

			break;
		case 3:
			// 직각방향
			// 상우

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			copy = up(x, y, copy);
			dfs(index + 1, copy);

			// 우하

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			copy = down(x, y, copy);
			dfs(index + 1, copy);

			// 하좌

			copy = clone(mapCopy);
			copy = down(x, y, copy);
			copy = left(x, y, copy);
			dfs(index + 1, copy);

			// 좌상

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			copy = up(x, y, copy);
			dfs(index + 1, copy);

			break;
		case 4:
			// ㅗ 방향
			// 좌상우

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			copy = up(x, y, copy);
			copy = left(x, y, copy);
			dfs(index + 1, copy);

			// 상우하

			copy = clone(mapCopy);
			copy = up(x, y, copy);
			copy = right(x, y, copy);
			copy = down(x, y, copy);
			dfs(index + 1, copy);

			// 우하좌

			copy = clone(mapCopy);
			copy = right(x, y, copy);
			copy = down(x, y, copy);
			copy = left(x, y, copy);
			dfs(index + 1, copy);

			// 하좌상

			copy = clone(mapCopy);
			copy = up(x, y, copy);
			copy = left(x, y, copy);
			copy = down(x, y, copy);
			dfs(index + 1, copy);

			break;
		case 5:
			// 전방향
			copy = clone(mapCopy);
			copy = up(x, y, copy);
			copy = left(x, y, copy);
			copy = right(x, y, copy);
			copy = down(x, y, copy);
			dfs(index + 1, copy);
			break;
		}
	}

	public static int[][] clone(int[][] mapCopy) {
		if(mapCopy == null) return null;
		
		int[][] copy = new int[mapCopy.length][mapCopy[0].length];
		for(int i=0; i<mapCopy.length; i++) {
			System.arraycopy(mapCopy[i], 0, copy[i], 0, mapCopy[0].length);
		}
		return copy;
	}

	public static int[][] down(int x, int y, int[][] mapCopy) {
		for (int i = x; i < n; i++) {
			if (mapCopy[i][y] == 0)
				mapCopy[i][y] = 7;
			else if (mapCopy[i][y] == 6)
				break;
		}

		return mapCopy;
	}

	public static int[][] right(int x, int y, int[][] copy) {
		for (int j = y; j < m; j++) {
			if (copy[x][j] == 6)
				break;
			else if (copy[x][j] == 0)
				copy[x][j] = 7;
		}
		return copy;
	}

	public static int[][] left(int x, int y, int[][] copy) {
		for (int j = y; j >= 0; j--) {
			if (copy[x][j] == 6)
				break;
			else if (copy[x][j] == 0)
				copy[x][j] = 7;
		}
		return copy;
	}

	public static int[][] up(int x, int y, int[][] copy) {
		for (int i = x; i >= 0; i--) {
			if (copy[i][y] == 0)
				copy[i][y] = 7;
			else if (copy[i][y] == 6)
				break;
		}

		return copy;
	}

	public static void checkPlace(int[][] mapCopy) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mapCopy[i][j] == 0)
					count++;
			}
		}
		min = Math.min(min, count);
	}
}


