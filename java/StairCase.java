import java.io.*;
import java.util.*;
//import java.text.*;

public class StairCase{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        	int n = in.nextInt();
		walkStair(n);
	}
	
	static void walkStair(int n) {
        	String[][] stair = new String[n][n];
        	int stairCase = n-1;
        	int rowNum = n;
        	for(int i = 0; i < n; ++i){
          	
			int row = 0;
		 	while(row < n && row >= 0){				
				stair[i][row] = "#";
                		++row;
			}
            	}
        	for(int i = 0; i < n; ++i){
			int colLen = n-2;
			//if(i != n-1){
			  colLen -= i;	
			  System.out.println("i::" + i);
			  System.out.println("colLen::" + colLen);
			  while(colLen >= 0){
			  System.out.println("2::i:" + i);
			  System.out.println("2::colLen:" + colLen);
			    String pd = " ";
			    stair[i][colLen] = pd;
                            --colLen;
			   }
			//}
		}
        for(int j = 0; j < rowNum; ++j){
          	for(int t = 0; t < rowNum; ++t){
			System.out.print(stair[j][t]);
	       }
	System.out.println();
	}
    }
}