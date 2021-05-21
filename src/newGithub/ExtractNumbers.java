package newGithub;

public class ExtractNumbers {
	public static String extractnum(String str) {
		String str2 = str.replaceAll("[^0-9]", " ");
		str2 = str2.trim();
		str2 = str2.replaceAll(" ", "");
		return str2;
	}

	public static String extractLetters(String str) {
		String str1 = str.replaceAll("[^a-z^A-Z]", " ");
		str1 = str1.trim();
		str1 = str1.replaceAll(" ", "");
		return str1;
	}

	public static void main(String[] args) {
		System.out.print(extractLetters("ind20ia21"));
		System.out.println();
		System.out.print(extractnum("ind20ia21"));
	}

}
