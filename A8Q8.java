public class A8Q8 {
public static void main(String[] args) {
	
	int N = Integer.parseInt(args[0]);
	boolean a[][] = new boolean[N + 1][N + 1];
	
	for(int i = 1; i < N + 1 ; i++)
	{
		for(int y = 1; y < N + 1; y++)
		{
			int HCF = GCD(i, y);
				
			    if(HCF == 1)
				   a[i][y] = true;
			    else
				   a[i][y] = false;
			    System.out.print(a[i][y] + "   ");
		}
		System.out.println();
	}
}
private static int GCD(int a, int b)
{
	if(b == 0)
		return a;
	return GCD(b, a % b);
}
}