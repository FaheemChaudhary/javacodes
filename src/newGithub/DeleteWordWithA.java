package newGithub;

public class DeleteWordWithA {
public static String removeWord(String str) {
	for(int i=0; i<str.length();i++) {
	if(str.charAt(i)=='a') {
		
		str=str.replaceAll("a","");
	}
	} 		
	return str;

}
	public static void main(String[] args) {
		String str="java is the best language";
		System.out.println(str);

	}

}
