import java.util.PriorityQueue;

public class Line{

	public static void main(String[] args){
		PriorityQueue<String> line = new PriorityQueue<>();
		line.add("David");
		line.add("Cynthia");
		line.add("Raymond");
		line.add("Bryan");
		line.add("Clayton");
		for(String name : line)
			System.out.println(name);
		line.poll();
		System.out.println();
		for(String name : line)
			System.out.println(name);
		line.remove("Raymond");
		
		System.out.println();
		for(String name : line)
			System.out.println(name);
		System.out.println("The head of the queue: " + line.peek());
	}
}