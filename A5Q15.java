import java.util.Scanner;
public class A5Q15{
	public static void main (String[]args) {
		
		Scanner savingAccount = new Scanner (System.in);
		
		System.out.print("Enter an Amount: ");
		double Amount = savingAccount.nextInt();
		
		System.out.print("The annual interest rate: ");
		double interest = savingAccount.nextInt();
		
		System.out.print("The number of months: ");
		double month = savingAccount.nextInt();
		
		double monthlyInterest = (interest/100)/12,  A = 0;
		
		
		for(int i = 1; i <=month ; i++)
		{
			 
			 A = (Amount + A ) * (1 + monthlyInterest);
		  	
		}
		System.out.print(A);
}
	}