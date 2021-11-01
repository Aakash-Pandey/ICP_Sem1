import java.util.Scanner;

public class A6Q13 {

	public static String Reverse(String s)
	{
	   int StringLength = s.length();
	   String rev = "";
	   
	   for (int i = StringLength - 1; i >= 0; i--) 
	   {
		  rev = rev + s.charAt(i);
	   }
	   return rev;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String to check for palindrome: ");
		String s = sc.nextLine();
		
		if(s.equalsIgnoreCase(Reverse(s)))
			System.out.println("\n\tPalindrome String");
		else
			System.out.println("\n\tNot a Palindrome string: ");
	}

}
