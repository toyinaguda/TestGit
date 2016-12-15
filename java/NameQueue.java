import java.util.LinkedList;

public class NameQueue{
	public static void main(String[] args){
		LinkedList<String> names = new LinkedList<>();
		names.addLast("Cynthia");
		names.addLast("Raymond");
		names.addLast("David");
		for(String name : names)
			System.out.println(name);
		if(names!= null && !names.isEmpty())
			names.removeFirst();
		System.out.println("----New List----");
		for(String name : names)
			System.out.println(name);
		names.addLast("Clayton");
		System.out.println("----New List----");
		System.out.println("Queue size: " + names.size());
		for(String name : names)
			System.out.println(name);
		
	}
}