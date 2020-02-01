package simulation;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         //table 1
         int row1 = sc.nextInt();
         String[][] table1 = makeTable(row1);
         //table 2
         int row2 = sc.nextInt();
         String[][] table2 = makeTable(row2);
         
         String[][] result = new String[row1+row2][5];
         int count =0;
         for(int i=0; i<row1;i++) {
        	 for(int j=0; j<row2; j++) {
        		 if(table1[i][0].equals(table2[j][0])) {
        			 
        			 result[count][0] = table1[i][0];
        			 result[count][1] = table1[i][1];
        			 result[count][2] = table1[i][2];
        			 result[count][3] = table2[i][1];
        			 result[count][4] = table2[i][2];
        			 
        			 count +=1;
        		 }
        	 }
         }
         System.out.println(count);
         for(int i=0; i<count;i++) {
        	 for(int j=0; j<5; j++) {
        		 
        		System.out.print(result[i][j]+" ");
        	 }
        	 System.out.println();
         }
    }

	private static String[][] makeTable(int row) {
		Scanner sc = new Scanner(System.in);
		String[][] table = new String[row+1][3];
        
        for(int i=0; i<=row; i++){
            String row_ = sc.nextLine();
            String[] row__ = row_.split(" ");
            for(int j = 0; j<row__.length; j++){
                table[i][j] = row__[j];
            }
        }
		return table;
	}
    
}