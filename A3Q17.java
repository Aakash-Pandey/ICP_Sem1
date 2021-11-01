import java.util.Scanner;
public class A3Q17{
public static void main(String[]args){
	
	Scanner divisiblity =  new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	
	int no = divisiblity.nextInt();
	
		boolean rr = ((no%5==0)&&(no%6==0)); 
		System.out.println("Is"+" "+ no +" "+"divisible by 5 and 6? "+ rr);
		
	
		boolean ww = ((no%5==0)||(no%6==0)); 
		System.out.println("Is"+" "+ no +" "+"divisible by 5 or 6? "+ ww);
		
	
	
		boolean qq = ((no%5==0)^(no%6==0)); 
		System.out.println("Is"+" "+ no +" "+"divisible by 5 or 6, but not both? "+ qq);
		
		
		
}}