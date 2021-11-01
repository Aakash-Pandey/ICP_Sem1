import java.util.Scanner;
public class A5Q22{
	public static void main(String[] args) {
		Scanner prime = new Scanner(System.in);
		
		System.out.print("Enter a number to check whether it's prime/composite: ");
		int N = prime.nextInt();
		
		int i = 2, count = 0;
		while ( i <= N-1 )
		{
			if (N % i == 0)
			{
				count++;
			    break;
			}
			i++;
		}
		if(count == 0)
		System.out.print("Prime");
		else
			System.out.print("Composite");
	}
}