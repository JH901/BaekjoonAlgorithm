import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num1350 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		List<Long> files = new ArrayList<>();
		Long fileSize =(long) 0;
		for(int i=0; i<n; i++) {
			fileSize = scan.nextLong();
			if(fileSize != 0) files.add(fileSize);
		}
		
		int cluster = scan.nextInt();
		
		long count=0;
		for(int i = 0; i < files.size(); i++) {
			count += (files.get(i)/cluster) +1;
		}
		long sum = cluster*count;
		System.out.println(sum);

	}

}
