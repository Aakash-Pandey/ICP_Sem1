import java.util.Scanner;
public class A6Q21{
	public static void main(String[] args) {
		Scanner gcd = new Scanner(System.in);
		
		System.out.print("Enter two numbers to calculate it's gcd: ");
		int a = gcd.nextInt(), b = gcd.nextInt();
		
		
		while ( b>0 )
		{
			int r = a%b;
			a = b;
			b = r;
		}
		System.out.print("GCD = "+ a);
	}
}