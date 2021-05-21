package newGithub;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccurWord {
	public static void occure(String[] inputstr) {
		HashMap<String, Integer> countmap = new HashMap<String, Integer>();
		//String[] words = inputstr.split("");
		for (String word : inputstr) {
			if (countmap.entrySet().contains(word)) 
				countmap.put(word, countmap.get(word) + 1);
			else 
				countmap.put(word, 1);
				}
		String maxstr="";
		int value=0;
				for (Map.Entry<String , Integer> entry: countmap.entrySet()) {
			
				String key=entry.getKey();
				Integer count = entry.getValue(); 
				if(count>value) {
					value=count;
				maxstr=key;
			}
				else if (count == value){ 
					if (key.length() < maxstr.length())
						maxstr = key; 
				}
				}
				System.out.println("Most occuring word: "+ maxstr);
				//System.out.println("Count: "+ value); 
			} 
	

	public static void main(String[] args) {
		String[] inputstr = { "java", "and java"};
		occure(inputstr);
	}

}
