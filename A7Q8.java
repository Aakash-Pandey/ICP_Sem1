import java.util.Scanner;
public class A7Q8{
	static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
	  
      int value [] = new int[0];
      int arr_Length = 0;
	  do
	  {
		    System.out.println("--------------Array Implementation------------------\n");
			System.out.println("a. Create an array of N integers.");
			System.out.println("b. Display the array elements.");
			System.out.println("c. Insert an element at specific position.");
			System.out.println("d. Delete an element at a given position.");
			System.out.println("e. Exit.\n");
			
			System.out.print("\nEnter your choice: ");
			char choice = sc.next().charAt(0);
			
			switch(choice)
			{
			  case 'a' : 
				              System.out.print("Enter size of array: ");
		                      arr_Length = sc.nextInt();
		                      value = new int[arr_Length];
				              System.out.println("Enter value: ");
			                  for(int i = 0; i < arr_Length ; i ++)
			                    {
			     	             value[i] = sc.nextInt();
			                    }
			                       break;
			                       
			  case 'b' :    
			                   Display(value, arr_Length);
			                       break;
		      case 'c' :
				           value = InsertionAtSpecificPosition(value, arr_Length);
				           arr_Length = arr_Length + 1;
				                   break;
			   
			  case 'd' :
				           value = DeletionAtSpecificPosition(value, arr_Length);
				           arr_Length = arr_Length - 1;
			                       break;
			   
			  case 'e' : 
				          System.exit(0);
			}
			
	  }while(true);
	
}
  
  private static int[] InsertionAtSpecificPosition(int oldArray[], int arr_Length)
	{
		int newArray[] = new int[arr_Length + 1];  //Create a new array of size n + 1.
		
		System.out.print("Enter the position: ");
		int position = sc.nextInt();
		
		System.out.print("Enter info: ");
      int N = sc.nextInt();
                                                   //insert the element from the old array
                                                  //into the new array insert till position
                                                 //then insert N at position
                                                //then insert reset of the elements
		for(int i = 0; i < arr_Length + 1; i++)
		  {
			if(i < position - 1)
				newArray[i] = oldArray[i];
			
			else if(i == position - 1)
				newArray[i] = N;
			
			else
				newArray[i] = oldArray[i - 1];
		  }
		return newArray;
	}
  
  private static int[] DeletionAtSpecificPosition(int array[], int arr_Length)
	{
		int location = Search(array);
		
		if(location == -1)
			System.out.println("Element Not Present!");
		else
		   {
			 for(int i = location + 1; i < arr_Length ; i++)
			 {
				 array[i - 1] = array[i];
			 }
		   }
		
		return array;	
    }
	
	private static int Search(int search[])
	{
      System.out.print("Enter info: ");
		int info = sc.nextInt();
		
		int location = 0;
		for(int i = 0; i < search.length; i++)
		  {
			if(search[i] == info)
			{
				location = i;
				break;
			}
			else
				 location = -1;
		  }
		return location;	
	}
	
	private static void Display(int array[], int arr_length)
	{
		for(int i = 0; i<arr_length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}