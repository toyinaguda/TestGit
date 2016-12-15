import java.util.PriorityQueue;
import java.io.*;


public class SquareDance{
	public static void main(String[] args){
		PriorityQueue<String> men = new PriorityQueue<>();
		PriorityQueue<String> women = new PriorityQueue<>();
		String line = null;
		String file = "c:\\data\\Dance.txt";
		String sex = "";
		BufferedReader input;
		try{
			input = new BufferedReader(new FileReader(file));
			while((line = input.readLine()) != null){
				sex = line.substring(0,1);
				if(sex.equals("M")){
					men.add(line.substring(2));
				}else{
					women.add(line.substring(2));
				}
			}
			input.close();
		}catch(IOException e){
			System.out.println("Error opening file");
			//System.out.println(e.stack);
		}/*finally{
			input.close();
		}*/
		while(!men.isEmpty() && !women.isEmpty()){
			System.out.print("The dance partners will be: ");
			System.out.println(men.poll() + " and " + women.poll());
		}
		if(men.isEmpty()){
			System.out.print("There are " + women.size());
			System.out.print(" women waiting to dance. ");
			System.out.println(women.peek() + " is the next woman dancer.");
		}
		if(women.isEmpty()){
			System.out.print("There are " + men.size());
			System.out.print(" men waiting to dance. ");
			System.out.println(men.peek() + " is the next man dancer.");
		}
	}
}