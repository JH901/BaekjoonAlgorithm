package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int topScore = 0;
		
		List<Integer> scores = new ArrayList<>();
		for(int i=0; i<n; i++) {
			//입력받은 점수 저장
			int score = scan.nextInt();
			scores.add(score);
			
			//점수중 최대값 찾기
			if(topScore < score) topScore = score;
		}
		
		double sum = 0;
		for(int score : scores) {
			double newScore = (double)score / topScore * 100;
			
			sum += newScore;
		}
		
		double result = sum / n;
		
		System.out.println(result);
	}

}
