import java.util.Scanner;
public class A2Q13 {
public static void main(String[]args) {
	
/*Write a java program that prompts the user to enter the minutes (e.g., 1 billion), and displays the 
 number of years and days for the minutes.*/
	
Scanner Time = new Scanner(System.in);
System.out.print("Enter the number of minutes : ");

int minutes = Time.nextInt();
int year = (minutes/(60*24*365));
int day =  ((minutes%(60*24*365))/(60*24));

System.out.print(minutes + " " + "minutes is approximately" + " " + year +" "+ "years" + " " + "and" + " "+ day + " " + "days" +".");

}

}
