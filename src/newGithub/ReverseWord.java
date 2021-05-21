package newGithub;

public class ReverseWord {
	public static String wordreverse(String s) {
		char[] ch = s.toCharArray();
		String result = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			result += ch[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(wordreverse("abcd"));
	}

}
