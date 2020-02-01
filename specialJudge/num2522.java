import java.util.Scanner;

public class num2522 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int star = 1;
		int empty = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<empty; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			empty--;
			star++;
		}
		empty = 1;
		star = n-1;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<empty; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<star; j++) {
				System.out.print("*");
			}
			System.out.println();
			empty++;
			star --;
		}

	}

}
