import java.util.Scanner;

public class A3Q2{

public static void main(String[] args) {
	
	Scanner Pass = new Scanner(System.in);
	
	System.out.print("Enter your marks :");
	
	double Mark = Pass.nextDouble();
	
	if (Mark>=40)
	      System.out.println("Congratulation! You have passed the exam.");
	else
	      System.out.println("Sorry! You have failed the exam.");
}
	 }
