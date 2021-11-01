import java.util.Scanner;
public class A6Q1{
	
	public static int additionSimple(int x, int y)
	{
		int c = y + x;
		return(c);
	}
	public static int subtractionSimple(int x, int y)
	{
		int e = y - x;
		return(e);
	}
	public static int multiplicationSimple(int x, int y)
	{
		
		int h = y * x;
		return(h);
	}
	public static double divisionSimple(int x, int y)
	{
		double k = y / x;
		     return(k); 
	}
	public static int remainderSimple(int m, int n)
	{
		int l = n % m;
		       return(l);
	}
	public static double squareRootSimple(int n)
	{
		double m = Math.sqrt(n);
		return(m);
	}
	
	
 public static void main (String[]args) {
		
		Scanner jj = new Scanner (System.in);
		System.out.print("Enter the value of x & y: ");
		
		 int x = jj.nextInt();
		 int y = jj.nextInt();
		 System.out.print("Enter the Operator: ");
		 char sign = jj.next().charAt(0);
		 
		 if (sign == '+')
		System.out.print(additionSimple(x,y));
		 
		 else if (sign == '-')
				System.out.print(subtractionSimple(x,y));
		 
		 else if (sign == '*')
				System.out.print(multiplicationSimple(x,y));
		 
		 else if (sign == '/')
		 {
			 if (x != 0)
			 System.out.print(divisionSimple(x,y));
			 else
			 System.out.print("Cannot divide by Zero"); 
		 }
		 else if (sign == '%')
				System.out.print(remainderSimple(x,y));
		 else
		 {
			 if(x > 0)
				System.out.print("Square root of "+ x + " = " + squareRootSimple(x));
			 else
				 System.out.print("Invalid input"); 
		 }
		 
	}
}