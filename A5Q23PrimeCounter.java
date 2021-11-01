public class A5Q23PrimeCounter{
	public static void main (String[]args) {
		
		int N = Integer.parseInt(args[0]);
		int count;
		
		
		for (int k = 2; k<=N; k++ )
		{
			count = 0;
			for(int y = 2; y<=k; y++)
			{
				if (k % y == 0)
				  count++;
			}
			if(count == 1)
				System.out.print(k + " Prime, ");
		}
	}
}