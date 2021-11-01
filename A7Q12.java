import java.util.Arrays;
import java.util.Scanner;

public class A7Q12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter info: ");
		int [] elements = new int [10];
		for(int i = 0; i<10; i++)
		{
			elements[i] = sc.nextInt();
		}
		selectionSort(elements);
		
		      System.out.println("After Sorting: \n"+ Arrays.toString(elements));
	}
	  private static int[] selectionSort(int [] elements)
	  {
		  for(int i = 0; i < 10 - 1; i++)
		  {
			//Find minimum element in unsorted array
			  int min_idx = i;        //so that original value of i should not change.          
			  for(int j = i + 1; j < 10; j++)
			  {
				  if(elements[j] < elements[min_idx])
					        min_idx = j;
			  }
			  //Swap the found minimum element with the first element.
			  
			  int temp = elements[i];
			  elements[i] = elements[min_idx];
			  elements[min_idx] = temp;
		  }
		  return elements;
	  }
}