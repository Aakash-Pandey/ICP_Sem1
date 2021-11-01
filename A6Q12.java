import java.util.Scanner;

public class A6Q12 {

	public static int Count(String str)
	{
		  int count = 0;
		
		for(int i = 0; i< str.length(); i++ )
		{       
		  if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				  count++;
	    }
		  return count;
	
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
	    String str = sc.nextLine();
	    
	    System.out.println("The number of occurrences of vowels" + " = " + Count(str));   
	}
}