package newGithub;

public class PrintStars {
	public static void stars(int n) {
		int m = n * n;
		for (int i = 0; i <= m; i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		int n = 2;
		stars(n);
	}

}
