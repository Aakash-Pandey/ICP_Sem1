import java.util.Scanner;
public class A7Q3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter integers: ");
		int [] array = new int[10];
		
		for(int i = 0; i < 10; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.print("Enter number to be searched: ");
		int N = sc.nextInt();
		
		LinearSearch(array, N);
}
	
	private static void LinearSearch(int [] array, int ToBeSearched)
	{      
		int occurence = 0;
		
		   for(int i = 0; i<10 ; i++)
		   {
			 if( array[i] == ToBeSearched )
				    occurence++;	 
		   }
			if(occurence == 0)
				System.out.println("Item "+ ToBeSearched + " is not Present.");
			else
				System.out.println("Item "+ ToBeSearched + " has occured "+ occurence + " times");
	}
}