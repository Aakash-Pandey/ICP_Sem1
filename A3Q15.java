import java.util.Scanner;
public class A3Q15{
public static void main(String[]args){
	
	Scanner point =  new Scanner(System.in);
	
	System.out.print("Enter point 'x' & 'y' :  " );
	
	double X = 0,Y = 0, X1 = point.nextDouble(),Y1 = point.nextDouble();
	
	double distance = Math.sqrt((Math.pow(X1-X, 2) + Math.pow(Y1-Y, 2)));
	
	if((distance<=10)&&(distance>=-10))
	           System.out.print("Point"+"("+ X1 + "," + Y1 +")"+"is in the circle" );
	else
		    System.out.print("Point"+"("+ X1 + "," + Y1 +")"+"is not in the circle");
	
point.close();	
}}