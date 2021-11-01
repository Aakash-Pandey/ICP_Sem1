import java.util.Scanner;
public class A5Q8{
	public static void main(String[]args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number to calculate it's factorial : ");
		int factorial = n.nextInt(), m=1;
		
		for(int k =1; k<=factorial; k++)
		{
			m=m*k;
		}
	System.out.print(factorial+"!"+" "+"="+" "+m);
	}
}
