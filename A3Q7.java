import java.util.Scanner;
public class A3Q7{
public static void main (String[]args) {
	
Scanner point = new Scanner(System.in);
System.out.print("Enter x, y : ");
double x = point.nextDouble(),y = point.nextDouble();

if((x==0)&&(y==0))
      System.out.print("Point is at origin ");

else if((x>0)&&(y>0))
System.out.print("("+ x + "," + y + ")" +" "+ "is in Ist quadrant");

else if ((x<0)&&(y>0))
	System.out.print("("+ x + "," + y + ")" +" "+ "is in IInd quadrant");

else if ((x<0)&&(y<0))
		System.out.print("("+ x + "," + y + ")" +" "+ "is in IIIrd quadrant");

else if ((x>0)&&(y<0))
		System.out.print("("+ x + "," + y + ")" +" "+ "is in IVth quadrant");

else if (y==0)
	System.out.println("The point is in x axis.");

else
	System.out.println("The point is in y axis.");
}
}

  
