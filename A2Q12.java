import java.util.Scanner;
public class A2Q12 {
public static void main(String[]args) {
	
/*Write a java program that asks the user how many eggs she has and then tells the user how many dozen 
 eggs she has and how many extra eggs are left over.*/
	
Scanner eggs = new Scanner(System.in);
System.out.print("Enter number of eggs : ");

int h = eggs.nextInt();
int gross = h/144;
int P = h%144;
int dozen = P/12;
int left = P%12;
System.out.print("Your number of eggs is" + " "+ gross+ " "+"gross" +" "+ dozen + " "+"dozen" + " "+ "and"+ " " + left+"." );

}
 }
