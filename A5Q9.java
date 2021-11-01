import java.util.Scanner;
public class A5Q9{
	public static void main (String[]args) {
		
		Scanner facto = new Scanner (System.in);
		System.out.print("Enter the value of x and n to compute x^n/n!: ");
		
		int x = facto.nextInt(),n = facto.nextInt(), m = 1;
		
		for(int k =1; k<=n; k++)
		{
			m=m*k;
		}
	System.out.println((Math.pow(x, n))/m);
		
	
}
	}