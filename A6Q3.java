import java.util.*;
public class A6Q3{
	                                                          public static int reverse(int Z)
	                                                           {
		                                                          int rev = 0, rem;
	                                                             while (Z != 0 )
	                                                               {
	            	                                                  rem = Z % 10;
	            	                                                  rev = rev * 10 + rem;
	            	                                                  Z = Z/10;
	            	
	                                                                }
	                                                             return(rev);
	                                                                
	                                                            }
	
	public static void main(String[] args) {
		
		Scanner number = new Scanner (System.in);
		System.out.print("Enter a Z: ");
		int N =  number.nextInt();
		

		if (isPalindrome(N))
			System.out.print("Palindrome = "+reverse(N));
		else
			System.out.print(reverse(N));
	}
	                                                   public static boolean isPalindrome(int number)
	                                                      {
		                                                    if (reverse(number) == number)
		                                                    	return true;
		                                                    else
		                                                    	return false;
	                                                      }
}