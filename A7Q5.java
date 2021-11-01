import java.util.Arrays;
import java.util.Scanner;

public class A7Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int N = sc.nextInt();
		
		  double arr[] = new double[N];
		  System.out.println("Enter array elements: ");
		for(int i = 0; i < N ;i++)
		  {
			arr[i] = sc.nextDouble();
		  }
		
		SecondLargest(arr, N);

	}
	
	public static void SecondLargest(double [] arr, int arr_Size)
	{
	   if(arr_Size < 2)               //There should be at least two elements.
		  {
			System.out.print("\n\tInvalid Input!!");
			return;
		  }
	   else
	   {
		   double highest, secondHighest;
		   
		   //Initialize these to the smallest value possible.
		   highest = secondHighest = Integer.MIN_VALUE;
		   
		   for(int i = 0; i < arr_Size; i++)
		     {
			   //If current element is greater than highest.
			   if(arr[i] > highest)
			   {
				   //assign second highest element to highest element.
				   secondHighest = highest;
				   
				   //highest element to current element;
				   highest = arr[i];
			   }
			   
			   //If arr[i] is in between first and second then update second.
			   
			   else if(arr[i] > secondHighest && arr[i] != highest)
				       secondHighest = arr[i];
			}
		   
		   if(secondHighest == Integer.MIN_VALUE)
			   System.out.println("No second largest value present.");
		   else
			   System.out.println("\n\tThe second largest value is: "+ secondHighest);
	   }
	}





/*
    * Initialize highest and secondHighest with minimum possible value.
    * Iterate over array.
    * If current element is greater than highest
            ~Assign secondHighest = highest;
            ~Assign highest = current element;
            
   * Else if current element is greater than secondHighest
            ~Assign secondHighest = current element
 */




	
	public static void print2largest(int arr[], int arr_size)
	{
		if(arr_size < 2)               //There should be at least two elements.
		  {
			System.out.print("\n\tInvalid Input!!");
			return;
		  }
		
		//Sort the array
		Arrays.sort(arr);
		
		//Start from second last element as the largest element is at last
		 for(int i = arr_size -2; i>= 0; i--)
		    {
			    //if the element is not equal to largest element.
			     if(arr[i] != arr[arr_size -1])
			     {
			    	 System.out.printf("The second largest elemenet is %d\n",arr[i]);
			    	 return;
			     }
		    }
		 System.out.printf("There is no second largest element\n");
	}
	
	
   public static double nd2Largest(double Value[],int array_size)
	  {
		  double max = Value[0]; double nd2max = Value[0];
		for(int i = 1; i<array_size; i++)
		  {
			if(max<Value[i])
				  max = Value[i];   //Getting the largest element in array.
			
			if(Value[i] == max)
				  continue;         //Skips Maximum value.
			
			  if(nd2max<Value[i])
				  nd2max = Value[i];  //Getting Second Maximum value.
		  }
		  return nd2max;
	}
}