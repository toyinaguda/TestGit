public class Compare2String{
	public static void main(String[] args){
		String str1 = "abc";
		String str2 = "aabc";
		int counter = 0;
		
		for(int i = 0; i < str1.length(); i++){
			char c = str1.charAt(i);
			for(int j = 0; j < str2.length(); j++){
				if(c == str2.charAt(i))
					counter++;
			}
		}
		if(counter >= str1.length())
			System.out.println(str1 + " is in " + str2);
	
	}
}