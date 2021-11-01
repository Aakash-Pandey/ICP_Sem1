import java.util.Scanner;
public class A2Q11 {
public static void main(String[]args) {
	
/*Write a java program that reads in investment amount, annual interest rate, and number of years, and 
 displays the future investment value.*/
	
Scanner investment = new Scanner(System.in);
System.out.print("Enter investment amount :");
double InvestmentAmount = investment.nextDouble();
System.out.print("Enter annual interest rate in percentage :");
double Rate = investment.nextDouble();
System.out.print("Enter number of years :");
double Time = investment.nextDouble();
double futureInvestmentValue = InvestmentAmount*(Math.pow(1 + (Rate/1200), Time*12));
System.out.print("Accumulated value is $" + futureInvestmentValue);
}
 }
