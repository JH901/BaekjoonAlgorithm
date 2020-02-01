package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			int input = scan.nextInt();
			inputs.add(input);
		}
		
		inputs.sort(null);
		
		System.out.println(inputs.get(1));
		
		
	}

}
