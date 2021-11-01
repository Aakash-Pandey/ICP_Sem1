import java.util.Scanner;
public class A6Q9{
	
	public static int GCD(int a, int b) 
	{	
		while (b > 0)
		{
			int r = a%b;
			    a = b;
			    b = r;
		}
		return a;
	}
	

	public static void addFraction(int N1, int D1, int N2, int D2)
	{
		int D3 = GCD(D1, D2);         //Getting Greatest Common Divisor of both denominator.
		
		D3 = (D1*D2)/ D3;             //Getting Smallest Common Denominator; By Multiply both 
		                             // Denominator and dividing it by their greatest Common Divisor.
		
		int N3 = N1 * (D3/D1) + N2 * (D3/D2);     //Multiplying numerator by the value of how many
		                                         // times should we multiply denominator to obtain 
		                                         // Smallest Common denominator.
		lowest(N3,D3);
	}
	
	
	// Function to convert the obtained fraction into it's simplest form
	
		public static void lowest(int N, int D)
		{
			int commonFactor = GCD(N, D);
			
			//Converting both term into simpler terms by dividing them by common factor.
			
			D = D/commonFactor;
			N = N/commonFactor;
			
			System.out.println( "\n\t "+ N + "/" + D);
		} 
	
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Numerator1: ");
			int Numerator1 = sc.nextInt();
			
			System.out.print("Enter Denominator1: ");
			int Denominator1 = sc.nextInt();
			
			System.out.print("Enter Numerator2: ");
			int Numerator2 = sc.nextInt();
			
			System.out.print("Enter Denominator2: ");
			int Denominator2 = sc.nextInt();
			
			
			addFraction(Numerator1, Denominator1, Numerator2, Denominator2);
	}
}