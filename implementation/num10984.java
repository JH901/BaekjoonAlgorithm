package implementation;

import java.util.Scanner;

public class num10984 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		double[][] gpa = new double[t][2];
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int sum=0;
			double gSum=0;
			for(int j=0; j<n; j++) {
				int c = scan.nextInt();
				double g = scan.nextDouble();
				
				sum +=c;
				gSum +=g*c;
			}
			gpa[i][0] = sum;
			gpa[i][1] = gSum/sum;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println((int)gpa[i][0]+" "+Math.round(gpa[i][1]*10)/10.0);
		}
	}

}
