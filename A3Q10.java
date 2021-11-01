import java.util.Scanner;
public class A3Q10{
public static void main(String[]args){

/*Write a java program that prompts the user to enter an integer for today’s day of the week 
 (Sunday is 0, Monday is 1… and Saturday is 6). Also prompt the user to enter the number of days 
 after today for a future day and display the future day of the week.*/	
	
Scanner dayno = new Scanner(System.in);
System.out.print("Enter today's day no: ");
int dy = dayno.nextInt();
System.out.print("Enter the number of days elapsed since today: ");
int nextdy = dayno.nextInt();

int futureday = ((dy+nextdy)%7);

switch (dy)
{
   case 0 : System.out.print("Today is Sunday");break;
   case 1 : System.out.print("Today is Monday");break;
   case 2 : System.out.print("Today is Tuesday");break; 
   case 3 : System.out.print("Today is Wednesday");break; 
   case 4 : System.out.print("Today is Thursday");break; 
   case 5 : System.out.print("Today is Friday");break; 
   case 6 : System.out.print("Today is Saturday");break; 
}
switch (futureday)
{
   case 0 : System.out.print(" and the future day is Sunday");break;
   case 1 : System.out.print(" and the future day is Monday");break;
   case 2 : System.out.print(" and the future day is Tuesday");break; 
   case 3 : System.out.print(" and the future day is Wednesday");break; 
   case 4 : System.out.print(" and the future day is Thursday");break; 
   case 5 : System.out.print(" and the future day is Friday");break; 
   case 6 : System.out.print(" and the future day is Saturday");break; 
	
}
}
}