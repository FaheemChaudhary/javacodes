package newGithub;

public class SumOfDigits {
public static int digitsum(int number) {
	int remainder, result=0;
	while(number > 0) {
		 remainder=number%10;
		 result=result+remainder;
		 number=number/10;
		}
		return result;
}
public static void main(String[] args) {
	System.out.println("The sum is : "+digitsum(121));
}

}
