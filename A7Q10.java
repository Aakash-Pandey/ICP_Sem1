import java.util.*;
public class A7Q10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list = new int[10]; 
		System.out.println("Enter ten numbers: ");
		     for(int i = 0; i < 10; i++)
		     {
		    	 list[i] = sc.nextInt();
		     }
	
	//list = eliminateDuplicates(list);
		
	//System.out.println("The distinct numbers are: ");
		//for(int i = 0; i < 10; i++)
		//{
			   //if(list[i] != 0)
			//System.out.print( list[i] + "  ");
		//}
	
  // eliminateDuplicates1(list);
   eliminateDuplicates2(list);
	}
	
	
	public static int[] eliminateDuplicates(int[] list)
	{
		Arrays.sort(list);
		int [] temp = new int[list.length];  //creating another array for stored element.
		int j = 0;
		
		for(int i = 0; i < list.length - 1; i++)
		  {
			  if(list[i] != list[i + 1])
			    {
				   temp[j] = list[i];
			           j++;
			    }
		  }
		       temp[j] = list[list.length - 1];
		return temp;
	}
	
	private static void eliminateDuplicates1(int[] list)
	{Arrays.sort(list);
		
		int j = 0;
		for(int i = 0; i < list.length - 1; i++)   //check if the i'th element is not equal to
		{                                         //the (i + 1)th element, then add that element
			if(list[i] != list[i + 1])           //at the jth index in the same array which 
			{                                   //indicates that the particular element will
				list[j] = list[i];             //only be added once in the array.
			            j++;
			}
		}
		       list[j] = list[list.length - 1];
	                    j++;
	   
	 System.out.println("\nThe distinct numbers are: ");
	      for(int i = 0; i < j; i++)
	         {
	              if(list[i] != 0)
	              System.out.print(list[i] + "  ");
	         }
	}
	
	private static void eliminateDuplicates2(int[] list)
	{
		LinkedHashSet <Integer> hs = new LinkedHashSet<Integer>();
		
		//adding elements to linkedHashSet
		for(int i = 0; i < list.length; i++)
		       hs.add(list[i]);
		
		System.out.println("\nThe distinct numbers are: ");
		System.out.print(hs);
	}
}