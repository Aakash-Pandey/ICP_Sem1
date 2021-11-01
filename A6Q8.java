import java.util.*;
public class A6Q8{
	public static void main (String[]args){
		Scanner polygon = new Scanner (System.in);
		
		System.out.print("Enter the number of sides of polygon: ");
		int N = polygon.nextInt();
		System.out.print("Enter the length of polygon: ");
		double sideLength = polygon.nextDouble();
		
		System.out.print("The area of the polygon is: " + area(N , sideLength));
	}
	
	public static double area(int n, double side)
	{
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		return(area);
	}
}