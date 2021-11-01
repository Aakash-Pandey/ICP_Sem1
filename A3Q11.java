import java.util.Scanner;
public class A3Q11{
public static void main (String[]args) {
	
//Write a java program by using some if statements to show the category for a given BMI.
	Scanner health = new Scanner(System.in);
	System.out.print("Enter your height in meter: ");
	double hei = health.nextDouble();
	System.out.print("Enter your weight in kg: ");
	double wei = health.nextDouble();
	double BMI = wei/(Math.pow(hei, 2));
	 
	if(BMI<18.5)
	  System.out.print("UNDER WEIGHT");
	
	else if(BMI<=24.9)
		System.out.print("NORMAL WEIGHT");
	
	else if((BMI>=25.0)&&(BMI<=29.9))
		System.out.print("OVER WEIGHT");
	
	else
		System.out.print("OBESE");
	
	}
}