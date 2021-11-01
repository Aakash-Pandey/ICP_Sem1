import java.util.Scanner;
public class A3Q5 {
public static void main(String[] args) {
	
Scanner E = new Scanner(System.in);
System.out.print("Enter the value of a,b & c :");
 double a = E.nextDouble();
 double b = E.nextDouble();
 double c = E.nextDouble();

if (((b*b)-(4*a*c))>0)
{
System.out.print((("The equation has two roots"+" "+ ((-b+(Math.sqrt((b*b-4*a*c)))))/(2*a)) +" "+ "and" +" "+((-b-(Math.sqrt((b*b-4*a*c)))))/(2*a)));	
	
}
else if (((b*b)-(4*a*c))==0)
{
 System.out.print("The equation has one root"+" " +-b/(2*a));
}
 else
 {
	 System.out.print("The equation has no real roots");
 }

}} 