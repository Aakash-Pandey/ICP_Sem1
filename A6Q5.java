
public class A6Q5 {
	
public static boolean isPrime(int number) {
		
		for(int i = 2; i <= number/2 ; i++)
		{
			if(number % i == 0)
			  return false;
		}
		return true;
	}
	public static void main(String[]args) {
		
for(int N = 2; N <1000; N++)
		{
		   if(isPrime(N))
		   System.out.print(N +" ");
		}
		
	}

}
