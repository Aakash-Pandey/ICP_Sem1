import java.util.Scanner;
public class A6Q4{
	
 public static int numberOfDaysInAYear(int year)
 {
	boolean leapYear = (((year%4==0)&&(year%100!=0))||(year%400==0));
			if (leapYear == true)
				return(366);
			else 
				return(365);
		 
 }
	
	public static void main (String[]args) {
		Scanner year = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int days = year.nextInt();
		
	System.out.print(numberOfDaysInAYear(days));
	}
}