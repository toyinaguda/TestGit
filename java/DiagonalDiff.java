import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDiff{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
	int diagonalSum1 = 0;
	int diagonalSum2 = 0;
	int i = 0;
	int j = 0;
	while(i < n){
		diagonalSum1 += a[i][j];
		i++;
		j++;
	}
	i = n-1;
	j = 0;
	while(i >= 0){
		diagonalSum2 += a[i][j];
		i--;
		j++;
	}
	if(diagonalSum1 > diagonalSum2)	
		System.out.print(diagonalSum1 - diagonalSum2);
	else if(diagonalSum1 < diagonalSum2)	
		System.out.print(diagonalSum2 - diagonalSum1);
    }
}