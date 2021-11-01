import java.util.Scanner;

public class A2Q5 {
	
public static void main (String[]args) {
	
/*Write a java program that prompts the user to enter the starting velocity v0 in meters/second, the 
 ending velocity v1 in meters/second, and the time span t in seconds, and displays the average 
 acceleration.*/
	
Scanner a = new Scanner(System.in);

System.out.print("Enter Vo in meter/second, V1 in meter/second, and t in second :");

double Vo = a.nextDouble();

double V1 = a.nextDouble();

double t = a.nextDouble();

double Acceleration = ((V1-Vo)/t);

System.out.print("The average acceleration is" + " " + Acceleration);

}

}