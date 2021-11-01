import java.util.Scanner;
public class A3Q6{
public static void main (String[]args) {
	
Scanner equ = new Scanner(System.in);
System.out.print("Enter a, b, c, d, e, f : ");
double a = equ.nextDouble(),b = equ.nextDouble(),c = equ.nextDouble(),d = equ.nextDouble(),e = equ.nextDouble(),f = equ.nextDouble();

if(((a*d)-(b*c))==0)

	System.out.println("The equation has no solution.");
	
	else
	{
		double x = ((e*d-b*f)/(a*d-b*c));
		
		double y = ((a*f-e*c)/(a*d-b*c));
		
		System.out.print("x is "+ x +" "+ "y is "+y);
		          
}
}
}
  
