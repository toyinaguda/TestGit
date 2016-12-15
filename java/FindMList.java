import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindMList{

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Enter the Mth element.");
		int m = in.nextInt();
		System.out.println("Enter the number of elements in the list and the elements.");
		int n = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
	for(int i = 0; i < n; ++i){
        	list.add(in.nextInt());
	}
	System.out.print(list);
	for(Integer l : list){
		if(l == m){
			System.out.println(list.get(m));
			break;
		}        
    }
	}
}