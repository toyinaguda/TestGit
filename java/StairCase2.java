import java.io.*;
import java.util.*;
//import java.text.*;

public class StairCase2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        	int n = in.nextInt();
		walkStair(n);
	}
	
	static void walkStair(int n) {
           String[] stair = new String[n];
           int counter = 0;
           for(int i = 0; i < n; ++i){
	     String str = "######";
	     String emptyStr = " ";
	     
	     if(i == 0){
		stair[i] = str;
	     }else if(i > 0){
		counter = i;
		int j = i;
		str = "";
		while(counter > 0){
			str = str+emptyStr;
			--counter;
		}
		while(j < n){
			str = str+"#";
			++j;
		}
		//stair[i] = str;
	     }
	     stair[i] = str;
	   }
 	     	
           for(int j = n-1; j >= 0; --j){
		System.out.println(stair[j]);
	   }
	
	}
 
}