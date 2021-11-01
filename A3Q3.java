import java.util.Scanner;
public class A3Q3{
public static void main (String[]args) {
	
Scanner no = new Scanner(System.in);

System.out.print("Enter a number to check even or odd :");

int num = no.nextInt();

if ((num%2)==0)
	
	      System.out.print("even number.");
else
	
	      System.out.print("odd number.");
}
   }