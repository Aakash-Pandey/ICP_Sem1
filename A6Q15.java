import java.util.Scanner;

public class A6Q15 {
static Scanner sc = new Scanner(System.in);
	
	public static double area(double base, double height) {
		
		double triangleArea = 0.5 * base * height;
		return triangleArea;
	}
	
	public static double area(double side)
	{
		double SquareArea = side * side;
		return SquareArea;
	}
	
	public static void area()
	{
		System.out.print("Enter radius of Circle: ");
		double radius = sc.nextDouble();
		
		double area = Math.PI * radius * radius;
		System.out.println("\n \t Area of Circle is " + area + "\n");
	}
	
	public static int area(int length , int width)
	{
		int rectangleArea = length * width;
		return rectangleArea;
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter base of triangle: ");
		double base = sc.nextDouble();
		
		System.out.print("Enter height of triangle: ");
		double height = sc.nextDouble();
		
		System.out.println("\n \tArea of Triangle: "+ area(base, height) + "\n"); //Area of triangle
		
		
		System.out.print("Enter side length of SQUARE: ");
		double sideLength = sc.nextDouble();
		
		System.out.println("\n \tArea of Square: " + area(sideLength) + "\n"); // Area of Square.
		
		area(); //Area of Circle.
		
		System.out.print("Enter length of Rectangle: ");
		int length = sc.nextInt();
		
		System.out.print("Enter breadth of Rectangle: ");
		int width = sc.nextInt();
		
		System.out.println("\n \tArea of Rectangle: " + area(length,width)); // Area of Rectangle.
	}
}
