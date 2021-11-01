import java.util.Arrays;
import java.util.Scanner;

public class A7Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     int [] random = new int[100];
        
     for(int i = 0; i < 100; i++)
        random[i] = 0 + (int) (Math.random() * ((Integer.MAX_VALUE - 0) + 0));
              
              
      QuickSort(random, 0, (random.length - 1));                
        System.out.println(Arrays.toString(random));
              
              
      int randomIndex = (int) ((Math.random() * (100 - 0)) + 0);
          int randomNumber = random[randomIndex];
       System.out.println("\n  Search = " + randomNumber);
       
       
       
              
   
       System.out.println("\n********  Linear Search  ********\n");
       
       long startTime = System.nanoTime();
              
       int N = LinearSearch(random, randomNumber);
       System.out.println("Present on Index = " + N);
              
       long endTime = System.nanoTime();
              
       long executionTime = endTime - startTime; 
       System.out.println("\tExecution Time = " + executionTime + " nanoseconds.");
       
       
       
       
              
    System.out.println("\n********   Binary Search   ********\n");
                
         long startTime1 = System.nanoTime();
                
                
         int searched = binarySearch(random, 0, 99 , randomNumber);
         System.out.println("Present on Index = " + searched);
                
                
         long endTime1 = System.nanoTime();
                
                
         long executionTime1 = endTime1 - startTime1;
         System.out.println("\tExecution Time = " + executionTime1 + " nanoseconds");
                
           
                
         
    }
    
    private static int LinearSearch(int [] random, int look)
    {
        
    	for(int i = 0; i < 100; i++)
    	{
    		if(look == random[i])
    			return i;
    	}
    	return -1;
    }
    
    
    private static int binarySearch(int [] Sorted, int low, int high, int look)
    {
    	
    	while(low <= high)
    	{
    		int mid = low + (high - low) / 2;
    		
    		if(Sorted[mid] == look)
 			     return mid;
    		
    		else if(Sorted[mid] < look)
    			    low = mid + 1;
    		
    		else
    			 high = mid - 1;
    	}
    	return -1;
    }
    
    
    
    private static int Partition(int [] random, int L, int R)
    {
    	int pivot = random[R];
    	
    	int i = L - 1;
    	
    	for(int j = L; j < R; j++)
    	{
    		if(random[j] <= pivot)
    		{
    			i++;
    			
    			
    			int temp = random[i];
    			random[i] = random[j];
    			random[j] = temp;
    		}
    	}
    	int temp = random[i + 1];
		random[i + 1] = random[R];
		random[R] = temp;

    
    return (i + 1);
   }
    
    
    
    private static void QuickSort(int [] random, int L, int R)
    {
    	if(L < R)
    	{
    		int partionIndex = Partition(random, L, R);
    		
    		QuickSort(random, L, partionIndex - 1);
    		QuickSort(random, partionIndex + 1, R);
    	}
    }
}