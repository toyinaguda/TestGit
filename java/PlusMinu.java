import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
	double posNumCounter = 0.0;
	double negNumCounter = 0.0;
	double zeroNumCounter = 0.0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
	    if(arr[arr_i] > 0)
		posNumCounter += 1;
	    else if(arr[arr_i] < 0)
		negNumCounter += 1;
	    else if(arr[arr_i] == 0)
		zeroNumCounter += 1;
	}
	DecimalFormat df = new DecimalFormat("0.0000000");
	System.out.println(df.format(posNumCounter/n));
	System.out.println(df.format(negNumCounter/n));
	System.out.print(df.format(zeroNumCounter/n));
    }
}