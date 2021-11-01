import java.util.*;
public class A7Q4{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		double arr[] = new double[10];
		for(int k = 0; k<10; k++)
		{
			arr[k] = sc.nextDouble();
		}
		
		System.out.println("\n\t The minimum number is: " + min(arr));
	}
	
	public static double min(double[] array)
	{
		//if
		    double min = array[0];
		    
		for(int i = 1; i<10; i++)
		{
			if(array[i] < min)
				min = array[i];
		}
		return min;
	}
}