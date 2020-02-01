package samsung;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class num15686 extends Home{
	static Map<Integer,Integer> c_distance = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		List<Home> list = new ArrayList<Home>(); 
		int input;
		for(int i=1; i<r+1; i++) {
			for(int j=1; j<r+1; j++) {
				input = scan.nextInt();
				if(input == 1) {
					Home home = new Home();
					home.x = i;
					home.y = j;
					list.add(home);
				}else if(input ==2) {
					int xy = (i*10)+j;
					c_distance.put(xy, 0);
				}
			}
		}
		
		int x,y;
		int val;
		for(int i=0; i<list.size(); i++) {
			Home h = list.get(i);
			for(int xy: c_distance.keySet()) {
				//치킨집의 좌표
				x = xy/10;
				y = xy%10;
				
				//치킨집 좌표 - 집의 좌표
				x -= h.x;
				y -= h.y;
				
				//음의 정수가 나왔을 시 절대값 처리
				if(x < 0) x = x*(-1);
				if(y < 0) y = y*(-1);
				//집을 기준으로 치킨 집의 거리
				h.chickenDistance.put(xy, x+y);
				
				//치킨 집을 기준으로 집의 거리의 총합
				val = c_distance.get(xy) + (x+y);
				c_distance.put(xy, val);
			}
		}
		
		int[][] distanceRank = new int[c][2];
		
		for(int xy: c_distance.keySet()) {
			val = c_distance.get(xy);
			System.out.println(xy+" / "+val);

			for(int i=0; i<c; i++) {
				if(distanceRank[i][0]>val || distanceRank[i][0]==0) {
					distanceRank[i][0] = val;
					distanceRank[i][1] = xy;
				}
			}
		}
		
		int sum=0;
		int min;
		for(int i=0; i<list.size(); i++) {
			min = Integer.MAX_VALUE;
			for(int j=0; j<c; j++) {
//				System.out.println("j: "+j+" distanceRank[j][1]: "+distanceRank[j][1]);
//				System.out.println(chickenDistance.get(distanceRank[j][1]));
				min = Math.min(min, list.get(i).chickenDistance.get(distanceRank[j][1]));
			}
			sum += min;
		}
		
		System.out.println(sum);
	
	}
}

class Home{
	static int x;
	static int y;
	static Map<Integer, Integer> chickenDistance = new HashMap<Integer,Integer>();
}
