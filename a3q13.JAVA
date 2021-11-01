import java.util.Scanner;
public class A3Q13{
public static void main (String[]args) {
	
/*Write a java program that prompts the user to enter the month and year and displays the number of days in the month. For example, if the
  user entered month 2 and year 2012, the program should display that February 2012 had 29 days. If the user entered month 3 and year 
 2015, the program should display that March 2015 had 31 days.*/
	
Scanner noday = new Scanner(System.in);
System.out.print("Enter month in number : ");
int month = noday.nextInt();
System.out.print("Enter year:  ");	
int year = noday.nextInt();	
noday.close();
switch(month) {
       case 1 : System.out.print("JANUARY"+" "+year+" "+ "had 31 days"); break;
       
       case 2 :System.out.print("FEBRUARY"+ " "+year);
       {
                       
    	   if (((year%4==0)&&(year%100!=0))||(year%400==0)) 
    		   
    	   	System.out.print(" "+"had 29 days");
    	   else
    	   	System.out.print(" "+"had 28 days");
       }break;
       case 3 : System.out.print("MARCH"+" "+year+" "+"had 31 days"); break;
       case 4 : System.out.print("APRIL"+" "+year+" "+"had 30 days"); break;
       case 5 : System.out.print("MAY"+" "+year+" "+"had 31 days"); break;
       case 6 : System.out.print("JUNE"+" "+year+" "+"had 30 days"); break;
       case 7 : System.out.print("JULY"+" "+year+" "+"had 31 days"); break;
       case 8 : System.out.print("AUGUST"+" "+year+" "+"had 31 days"); break;
       case 9 : System.out.print("SEPTEMBER"+" "+year+" "+"had 30 days"); break;
       case 10 : System.out.print("OCTOBER"+" "+year+" "+"had 31 days"); break;
       case 11 : System.out.print("NOVEMBER"+" "+year+" "+"had 30 days"); break;
       case 12 : System.out.print("DECEMBER"+" "+year+" "+"had 31 days"); break;
}

	}
}