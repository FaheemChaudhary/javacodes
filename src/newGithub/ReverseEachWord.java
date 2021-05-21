package newGithub;

public class ReverseEachWord {
	public static String revEachWord(String str) {

		char[] ch = str.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];

		}
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(revEachWord("Java start"));
	}

}
