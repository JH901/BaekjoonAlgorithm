import java.util.Scanner;

public class num1069 {
	static double min = Double.MAX_VALUE;
	static int d;
	static int t;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		d = scan.nextInt();
		t = scan.nextInt();
		
		move(x,y,0);
		System.out.println(min);

	}

	private static void move(int x, int y, double time) {
		if(x==0 && y==0) {
			min = Math.min(min, time);
			return;
		}
		
		if(x<0 || y<0) return;
		
		//°È±â
		//À§
		move(x-1,y,time+1);
		//¿ì
		move(x,y-1,time+1);
		
		//¶Ù±â
		//À§
		move(x-d,y,time+t);
		//¿ì
		move(x,y-d,time+t);
		
	}

}
