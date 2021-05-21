package newGithub;

import java.util.HashMap;
import java.util.Map;

//Count the occurrence of each letter in a string
public class OcurrenceOfLetter {
	static void occure(String inputstr) {
		HashMap<Character, Integer> countmap = new HashMap<Character, Integer>();
		char[] chararray = inputstr.toCharArray();
		for (char ch : chararray) {
			if (countmap.containsKey(ch)) 
				countmap.put(ch, countmap.get(ch) + 1);
			 else 
				countmap.put(ch, 1);
			}
		
		// print the countmap
		for(Map.Entry entry: countmap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	}
	public static void main(String[] args) {
		String inputstr="java";
		occure(inputstr);
	}

}
