package newGithub;

public class Factorial {
	public static int factor(int n) {
		int output;
		if (n == 1) {
			return 1;
		}
		output = factor(n - 1) * n;

		return output;
	}

	public static void main(String[] args) {
		int factorial = factor(3);
		System.out.println("factorial is  " + factorial);

	}

}
