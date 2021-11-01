import java.util.Scanner;
public class A3Q18{
public static void main(String[]args){
	
	 Scanner naming = new Scanner(System.in);
	 System.out.print("Enter your gender(Male/Female) : " );
	 char gender = naming.next().charAt(0);
	  System.out.print("First Name: ");
	  String FirstName = naming.next();
	  System.out.print("Last Name: ");
	  String LastName = naming.next();
	  System.out.print("Enter Your Age: ");
	  int age = naming.nextInt();
	  
if(gender=='F')
    {
	if(age>=20)
	  {
		System.out.print("Are You Married(Yes/No): ");
	    char Married = naming.next().charAt(0);
	    
	       {if(Married=='Y')
		      System.out.print("Mrs."+FirstName+" "+LastName);
	        else  if(Married=='N')
		      System.out.print("Ms."+FirstName);
           }
	  
	  }
	else
		System.out.print(FirstName+" "+LastName);
	  
    }
else if((gender=='M')&&(age>=20))
    {
	System.out.print("Mr."+FirstName+" "+LastName);
    }
else
	System.out.print(FirstName+" "+LastName);  
	  
	  
    }}