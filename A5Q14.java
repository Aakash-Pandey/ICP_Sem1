import java.util.Scanner;
public class A5Q14{
	public static void main (String[]args) {
		
		Scanner fibonaccin = new Scanner (System.in);
		System.out.print("Enter the number of terms of the fibonaccin series: ");
		int N = fibonaccin.nextInt();
		
		
		int a = 0,b = 1;
		for(int i = 1; i<=N/2; i++)
		     {
			    System.out.print(a + " " + b +" ");
			    a = a+b;
			    b = a + b;
			 
		     }
		if (N%2 != 0)
			 System.out.print(a);
		
		
}
	}import java.util.Scanner;
public class Kashyap{
	public static void main (String[]args) {
		
		Scanner fibonaccin = new Scanner (System.in);
		System.out.print("Enter the number of terms of the fibonaccin series: ");
		int N = fibonaccin.nextInt();
		
		
		int a = 0,b = 1;
		for(int i = 1; i<=N/2; i++)
		     {
			    System.out.print(a + " " + b +" ");
			    a = a+b;
			    b = a + b;
			 
		     }
		if (N%2 != 0)
			 System.out.print(a);
		
		
}
	}