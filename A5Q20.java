import java.util.Scanner;
public class A5Q20{
	public static void main(String[] args) {
		Scanner smallestFactors = new Scanner(System.in);
		
		System.out.print("Enter a number to get it's smallest factors: ");
		int number = smallestFactors.nextInt();
		
		int i = 2;
		while ( number / i != 1)
		{
			if (number % i == 0)
			{
				System.out.print(i + ",");
				number /= i;
			}
			else
				i++;
		}
		System.out.print(number+".");
	}
}