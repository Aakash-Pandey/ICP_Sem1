import java.util.Scanner;
public class A5Q13{
	public static void main (String[]args) {
		
		Scanner fibonaccin = new Scanner (System.in);
		System.out.print("Enter the number of terms of the fibonaccin series: ");
		int N = fibonaccin.nextInt();
		int a = 0,b = 1,sum;
		
		for(int c = 1; c<=N; c++)
		
		{
			System.out.print(a + " ");
			sum = a+b;
			a = b;
			b = sum;
			
		 }
}
	}