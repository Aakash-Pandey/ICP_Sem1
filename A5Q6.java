import java.util.Scanner;

public class A5Q6{
	public static void main(String[]args) {
	Scanner read = new Scanner(System.in);
	
	System.out.print("Enter nth term: ");
     int N = read.nextInt();
     System.out.print("Find the Harmonic mean of the following Data: ");
     
     double AvgOfRecipocals = 0;
     
		int i = 1;
		while(i <= N)
		{
			double n = read.nextInt();
			AvgOfRecipocals +=  (1 / n);
			i++;	
		}
       System.out.println("Harmonic Mean = "+ N / AvgOfRecipocals );
	
	}
	}
