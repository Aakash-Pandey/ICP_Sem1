import java.util.Scanner;
public class A3Q4{
public static void main (String[]args) {
	
Scanner x = new Scanner(System.in);
System.out.print("Enter Any character :");
 char y = x.next().charAt(0);
 x.close();
 if ((65<=y)&&(y<=90))
  System.out.println("CAPITAL LETTER");
 
 else if ((97<=y)&&(y<=122))
 System.out.println("a small case letter");
 
 else if ((48<=y)&&(y<=57))
	 System.out.println("Digit");

 else if (y<=127)
	 System.out.println("Special Symbol");
 
 
}
  }
