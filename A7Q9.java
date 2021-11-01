import java.util.Scanner;

public class A7Q9 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter size: ");
	int N = sc.nextInt();
	
	System.out.println("\n\nEnter info: ");
	double [] info = new double[N];
	
	for(int i = 0; i < N; i++)
	{
		info[i] = sc.nextDouble();
	}
	
	System.out.println("\n\tThe mean is " + mean(info));
	System.out.println("\tThe standard deviation is "+ deviation(info));
	
  }
    
   public static double deviation(double[] x)
   {
	   double mean = mean(x);
	   double sum = 0;
	   
	   for(int i = 0; i < x.length; i++)
	      {
		        sum = sum + Math.pow((x[i] - mean), 2);
	      }
	   double deviation = Math.sqrt( sum / (x.length - 1));
	   
	   return deviation;
   }
   
   public static double mean(double[] x)
   {
	   double sum = 0;
	   int x_Size = x.length;
	   
	   for(int i = 0; i < x_Size; i++)
	   {
		   sum += x[i];
	   }
	   
	   double mean = sum / x_Size;
	   return mean;
   }
   
   
}
