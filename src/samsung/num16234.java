package samsung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class num16234 {
	static Map<United,Integer> uniteds = new HashMap<>();
	static int count =0;
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		
		int l = scan.nextInt();
		int r = scan.nextInt();
		
		int[][] map = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		move(true);
		

	}
	
	public static void move(boolean isFirst) {
		if(uniteds.isEmpty() && !isFirst) {
			System.out.println(count);
		}
		
	}

}

class United{
	List<Integer> countryies = new ArrayList<>();
}
