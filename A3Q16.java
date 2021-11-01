import java.util.Scanner;
public class A3Q16{
public static void main(String[]args){
	
/*A University conducts a 100 mark exam for its student and grades them as follows. Assigns a grade based on the value of the marks. Write a 
 java program to print the grade according to the mark secured by the student. [Use switch-case]*/
	
Scanner Report = new Scanner(System.in);
System.out.print("Enter your marks out of 100: ");
double mark = Report.nextDouble();
 int grade =(int) mark/10;
switch(grade)
{       
   case 10:;
   case 9 : System.out.print("Your Mark "+mark+" "+"and your grade is 'O'");break;
   case 8 : System.out.print("Your Mark "+mark+" "+"and your grade is 'A'");break;
   case 7 : System.out.print("Your Mark "+mark+" "+"and your grade is 'B'");break;
   case 6 : System.out.print("Your Mark "+mark+" "+"and your grade is 'C'");break;
   case 5 : System.out.print("Your Mark "+mark+" "+"and your grade is 'D'");break;
   case 4 : System.out.print("Your Mark "+mark+" "+"and your grade is 'E'");break;
   default : System.out.print("Your Mark "+mark+" "+"and your grade is 'F'");

}
    }
  }