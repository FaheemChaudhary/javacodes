package newGithub;

public class EvenOddArray {

	public static void main(String[] args) {
		// WAP to find out even and Odd numbers in an array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("---The numbers are---");
		for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]+" ");
		}
		System.out.println("\n==============");
	      System.out.println("Even number of the array:");
		for (int i = 0; i < arr.length; i++)
		  {
              if (arr[i]%2 == 0)
              {
                      System.out.print(arr[i]+" ");
              }
      }
      System.out.println("\n==============");
      System.out.println("Odd number of the array:");
      for (int i = 0;i<arr.length ;i++ )
      {
              if (arr[i] % 2 != 0)
              {
               System.out.print(arr[i]+" ");
              }
      }
      System.out.println("\n==============");
		}
	

	}


