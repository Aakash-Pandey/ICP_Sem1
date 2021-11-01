import java.util.Scanner;
public class A2Q9 {
public static void main(String[]args) {
	
/*Write a java program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays 
 their distance between them.*/
	
Scanner point = new Scanner(System.in);
System.out.print("Enter x1 and y1 :");
double x1 = point.nextDouble(), y1 = point.nextDouble();
System.out.print("Enter x2 and y2 :");
double x2 = point.nextDouble(), y2 = point.nextDouble();
double distance = Math.sqrt(((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))));
System.out.println("The distance between the two points is" + " " + distance);


}

}