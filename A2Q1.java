import java.util.Scanner;

public class A2Q1 {
	
//Write a java program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result.
	
	public static void main(String args[]) {
		
	Scanner a = new Scanner(System.in);
	
	System.out.print("Enter degree in Celsius:" + " ");
	
	double celsius = a.nextDouble();
	
	System.out.println(celsius + " " + "Celsius is" + " " + (((9.0/5) * celsius)+32) + " " + "Fahrenheit");

	
			}
			
			}