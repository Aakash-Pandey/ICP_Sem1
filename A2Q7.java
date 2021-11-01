import java.util.Scanner;

public class A2Q7 {
	
public static void main(String[]args) {

//Write a java program that prompts the user to enter the side of a hexagon and displays its area.
	
Scanner m = new Scanner(System.in);

System.out.print("Enter the side of a hexagon :");

double side = m.nextDouble();

double area = (((3*(Math.sqrt(3)))/2)*Math.pow(side, 2));

System.out.println("The area of the hexagon is" + " "+ area);

}

}