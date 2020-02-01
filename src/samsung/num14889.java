package samsung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class num14889 {

	static int n;
	static int[][] abilityMap;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		abilityMap = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				abilityMap[i][j] = scan.nextInt();
			}
		}
		
		List<Integer> A = new ArrayList<>();
		makeTeam(A,0);
		
		System.out.println(min);
	}

	private static void makeTeam(List<Integer> A, int index) {
		
		if(index==n) {
			if(A.size() != n/2) return;
			List<Integer> B = new ArrayList<>();
			for(int i=0; i<n; i++) {
				if(!A.contains(i)) B.add(i);
			}
			System.out.println(A);
			System.out.println(B);
			int diff = countAbility(A)-countAbility(B);
			diff = Math.abs(diff);
			
			min = Math.min(min, diff);
			return;
		}
		
		System.out.println("1. A: "+A);
		makeTeam(A,index+1);
		
		
		if(!A.contains(index)) {
			A.add(index);
			System.out.println("2. A: "+A);
			makeTeam(A,index+1);
		}
		
		
		
	}

	private static int countAbility(List<Integer> list) {
		
		int sum = 0; 
		
		for(int i=0; i<list.size(); i++) {
			int x = list.get(i);
			for(int j=0; j<list.size(); j++) {
				int y = list.get(j);
				
				if(i != j) {
					sum += abilityMap[x][y];
				}
			}
		}
		
		return sum;
		
	}

}
