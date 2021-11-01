import java.util.Scanner;

public class A7Q7{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter decimal integer: ");
		int N = sc.nextInt();
		
		OctalRepresentation(N);
}
	
	private static void OctalRepresentation(int N)
	{
		int rem [] = new int[100];                          //array to store octal Number.
		
		int i = 0;                                        //Counter for Octal Number array.
		
		while(N != 0)
		{
		   rem [i] = N % 8;                                  //Storing reminder in array.
		   N = N / 8;
		   i++;
		}
		
	
		System.out.print("Octal Representation = ");
		                                       //Printing octal number: array in reverse order.
		for(int k = i - 1; k >= 0; k--)
		    System.out.print(rem[k]);
	}
}