public class A6Q6{
	
	public static boolean isPrime(int number)
	{
		for(int i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public static int Reverse(int number)
	{
		int rev = 0, rem;
		
	    while(number != 0)
		   {
	    	  rem = number % 10;
		      rev = rev * 10 + rem;
		      number = number / 10;
		   }
	    return rev;
	}
	
	public static boolean PalindromicPrime(int number)
	{
		if(number == Reverse(number))
			return true;
		else
			return false;
	}
	
	
	
	public static void main(String[] args) {
 System.out.println("\n*****************\tPalindromic Prime Number\t******************\n\n");
 
		int count = 1, number = 2, numberPerLine = 0;
		
		while(count <= 100)
		{
			if(isPrime(number) && PalindromicPrime(number))
			{
			               
			      System.out.print(number + " ");
			      
				       numberPerLine++;
				  if(numberPerLine % 10 == 0)
				    System.out.println();
				  
				  count++;
			}
			number++;
		}
		
	}
}