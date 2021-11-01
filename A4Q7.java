public class A4Q7{

	public static void main(String[] args) {
		
		int N = Integer.parseInt(args[0]);
		double Sum = 0;
		
		for(int jj = 1 ;jj<=N ; jj++ )
		{
			double random = Math.random();
			System.out.println(random);
		Sum = Sum+random;
			
		}
		System.out.println("Avg = "+Sum/N);
	}
	
}