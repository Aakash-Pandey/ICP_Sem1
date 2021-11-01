import java.util.Scanner;
public class A2Q4 {
public static void main(String[] args) {
	
	Scanner no = new Scanner(System.in);
	  System.out.print("Enter a number between a and b : ");
      int a = no.nextInt();
      int b = no.nextInt();
      

      int c = (a + (int)((b-a)*Math.random()));
      System.out.println(c);

      int d = c%10;
      int e = c/10;
      int f = e/10;
      int g = e%10;
      System.out.print("The sum of the digits is" + " " + (d+f+g));

}
	 }