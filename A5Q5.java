   import java.util.Scanner;
   public class A5Q5{
	   public static void main (String[]args) {
		   
		   Scanner unspecifiedNumber = new Scanner(System.in);
		   System.out.print("Enter number of digits: ");
		   int Z = unspecifiedNumber.nextInt();
		   System.out.print("Enter a number (number>=0): ");
		   
		   double N,sum=0;
		   
		   for ( int i = 1; i<=Z; i++)
		   {
			   N = unspecifiedNumber.nextInt();
			   sum+=N;
			   
		   }
		   System.out.println("The sum of digits are: "+sum);
		   System.out.println("Avg = "+sum/Z);
	   }
   }