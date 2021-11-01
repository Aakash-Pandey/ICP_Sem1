import java.util.Scanner;
public class A5Q11{
	public static void main (String[]args) {
		Scanner cosX = new Scanner(System.in);
		
		System.out.print("Enter the value of x in radian: ");
		double x = cosX.nextDouble(), m = 1,tsum = 1;
		
		
		int i = 0;
		while(Math.abs(m)>0.000001)
		{
			i = i + 2;
			m= -m*(x*x)/(i*(i-1));
			tsum = tsum + m;
			
		}
		System.out.print(tsum);
		
	}
}