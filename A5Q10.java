import java.util.*;
public class Vasishth{
	public static void main (String[]args) {
		
		Scanner sin = new Scanner (System.in);
		System.out.print("Enter the value of x in degree to compute sin(x): ");
		double X = sin.nextDouble();
		
		double Rad = Math.toRadians(X), tsum = Rad, term = Rad;
		int i = 1;
		while (Math.abs(term) > 0.000001)
		{
			i += 2;
			term = - term * (Rad * Rad )/ (i * (i-1)); 
			tsum = tsum + term;
		}
		System.out.println(tsum);
	}
}