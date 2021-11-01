import java.util.Scanner;
public class A6Q14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Create a new Password: ");
	String password = sc.nextLine();
	
	System.out.println((ValidityOfPassword(password) ? "Valid " : "Invalid ") + "Password");
	}
	
	public static boolean ValidityOfPassword(String password)
	{
		if(password.length() < 8)
			return false;
		else
		   {
			      int numberOfDigit = 0;
			      for(int i = 0; i<password.length(); i++)
			         {
				           if(isNumeric(password.charAt(i)) || hasAlphabet(password.charAt(i)) || Character.isWhitespace(password.charAt(i)))
					         {
					             if(isNumeric(password.charAt(i)))
					    		         numberOfDigit++;
					         }
				           else
				               {  return false; /*break;*/  }
			         }
			               if(numberOfDigit < 2)
			            	      return false;
			               else
			            	      return true;
		   }
	}
	
	public static boolean isNumeric(char c)
	{
		return (c <= '9' && c >= '0');
	}
	
	public static boolean hasAlphabet(char c)
	{
		return ((c <= 'Z' && c>= 'A') || (c <= 'z' && c>= 'a'));
	}
	
}