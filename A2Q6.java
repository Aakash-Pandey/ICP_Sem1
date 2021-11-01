import java.util.Scanner;

public class A2Q6 {
	
public static void main (String[]args) {
	
/*Write a java program that prompts the user to enter a weight in pounds and height in inches and 
 displays the BMI.*/
	
Scanner Index = new Scanner(System.in);

System.out.print("Enter weight in pounds :");

double weight = Index.nextDouble();

System.out.print("Enter height in inches :");

double height = Index.nextDouble();

double Kg = (0.45359237*weight);

double m = (0.0254*height);

double BMI  = ((Kg)/Math.pow(m, 2));

System.out.println("BMI is" + " " + BMI);

}

}