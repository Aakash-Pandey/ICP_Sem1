import java.util.Scanner;
public class A6Q11 {

	public static int count(String str, char a)
	{
		    int count = 0;
		int length = str.length();
		
		for(int i = 0; i<= length-1; i++ )
		{       
			if(str.charAt(i) == a)
				  count++;
	    }
		  return count;
	}
	
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	   System.out.print("Enter a String: ");
	    String str = sc.nextLine();
	    
	    System.out.print("Enter a specified character: ");
	    char c = sc.next().charAt(0);
	   
	    System.out.println("The number of occurrences of "+ c + " = " + count(str, c));
	}
}
