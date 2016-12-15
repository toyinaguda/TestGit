import java.util.TreeSet;

public class WordList{
	public static void main(String[] args){
		String text;
		text = "Either the well was very deep or she fell very slowly "
			+ "for she had plenty of time as she went down to look about "
			+ "her, and to wonder what was going to happen next First "
			+ "she tried to look down and make out what she was coming to "
			+ "but it was too dark to see anything then she looked at the "
			+ "sides of the well and noticed that they wete filled with "
			+ "cupboards and book-shelves: here and there she saw maps and "
			+ "pictues hung upon pegs. She took down a jar from one of the "
			+ "shelves as she passed it was laeled ORANGE MARMALADE but "
			+ "to her great disappointment it was empty she did not like to "
			+ "drop the jae for fear of killing somebody underneath so "
			+ "managed to put it into one of the cupboards as she fell past";
		String[] words = text.split(" ");
		for(String w : words)
			System.out.println(w);
		System.out.println("Total number of words: " + words.length);
		TreeSet<String> wordList = new TreeSet<>();
		for(String w : words)
			wordList.add(w);	
		System.out.println("New total of number unique words: " + wordList.size());
	}
}