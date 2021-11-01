import java.util.Scanner;

public class A7Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter info: ");
		int N = sc.nextInt();
		int [] list = new int[N];
		       for(int i = 0; i < list.length; i++)
		          {
		    	      list[i] = sc.nextInt();
		          }
		
		if(isSorted(list))
			System.out.println("\n\tThe list is already sorted.");
		else
			System.out.println("\n\tThe list is not sorted.");
	}
	
	public static boolean isSorted(int[] list) 
	{
		boolean isSorted = true;
	   for(int i = 0; i < list.length - 1; i++)
		{
			if( list[i] > list[i + 1] )
			   {
				  isSorted = false;
			          break;
			   }
		}
		return isSorted;
	}
}