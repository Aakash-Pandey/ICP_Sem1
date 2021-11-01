import java.util.Scanner;
public class A2Q10 {
public static void main(String[]args) {
Scanner point = new Scanner(System.in);

System.out.print("Enter three points for triangle :");

double x1 = point.nextDouble(), y1 = point.nextDouble();
double x2 = point.nextDouble(), y2 = point.nextDouble();
double x3 = point.nextDouble(), y3 = point.nextDouble();

double AB = Math.sqrt(((Math.pow((x2-x1), 2)) + (Math.pow((y2-y1), 2))));
double BC = Math.sqrt(((Math.pow((x3-x2), 2)) + (Math.pow((y3-y2), 2))));
double CA = Math.sqrt(((Math.pow((x1-x3), 2)) + (Math.pow((y1-y3), 2))));

double side = ((AB+BC+CA)/2);

double area = Math.sqrt((side*((side-AB)*(side-BC)*(side-CA))));

System.out.print("The area of the triangle is" + " " +area);



}

  }

