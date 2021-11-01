import java.util.Arrays;
import java.util.Scanner;
public class A7Q11{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int N = sc.nextInt();
		System.out.println("Enter array elements: ");
		double [] sort = new double[N];
		for(int i = 0; i < N; i++)
		  {
			sort[i] = sc.nextDouble();
		  }
		
		BubbleSort(sort, N);
		
		System.out.print("\n\tAfter Sorting: " + Arrays.toString(sort));
	}

	public static void BubbleSort(double sort[], int N)
	{
		for(int i = 0; i < N; i++)  //we have to repeat this logic for no. of elements we have.
		  {
			for(int j = 1; j < N - i; j++)     /*j < N-1 : because after each iteration we are
			                                               getting sorted value at last index
			                                               and now we have to sort reset of the
			                                               given digits; so (n-1),(n-2)......*/
			    { 
				    if(sort[j-1] > sort[j])       /*comparing current previous index(j-1) with
				                                              current index(j).*/
				    {
				      sort[j-1] = sort[j-1] + sort[j];
				      sort[j]   = sort[j-1] - sort[j];
				      sort[j-1] = sort[j-1] - sort[j];
				    }
			     }                            
		   }
	 }
}