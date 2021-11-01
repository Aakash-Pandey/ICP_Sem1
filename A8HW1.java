import java.util.Arrays;
import java.util.Scanner;

public class A8HW1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array length: ");
		int size = sc.nextInt();
		
		int [] array = new int[size];
		
		for(int i = 0; i < size; i++)
			  array[i] = (int) (Math.random() * ((100 - 0) + 1)) + 0;
		
		System.out.println( "\n" +Arrays.toString(array));
		
		Max_Or_Min(array);
	}
	
  public static void Max_Or_Min(int [] array)
   {
	 if(array.length == 1)
	  {
		System.out.println("Minimum = " + array[0]);
		System.out.println("Maximum = " + array[0]);
	  }
	else
	  {
		int Max = Integer.MIN_VALUE , Min = Integer.MAX_VALUE , Max_Count = 0, Min_Count = 0,
		    Max_First_Occurrence = -1 , Min_Last_Occurrence = -1;
				
		    for(int i = 0; i < array.length; i++)
		       {
			     if(array[i] > Max)
			       {
                     Max = array[i];
                     Max_Count = 1;
                     Max_First_Occurrence = i;
			        }
			  else if(array[i] == Max)
			         {
				       Max_Count += 1;
			         }
			  
			         
			        if(array[i] < Min)
			         {
				       Min = array[i];
				       Min_Count = 1;
				       Min_Last_Occurrence = i;
			         }
			  else if(array[i] == Min)
			         {
				        Min_Count += 1;
				        Min_Last_Occurrence = i;
			         }
	              }
		
		    System.out.println("\nMaximum = " + Max);
		    System.out.println("Minimum = " + Min);
		    
		    
		    
		    String x = (Max_Count > 1) ? "times." : "time.";
			System.out.println("\nMaximum Occurred = " + Max_Count + " " + x);
			
			String y = (Min_Count > 1) ? "times." : "time.";
			System.out.println("Minimum Occurred = " + Min_Count + " " + y);
			
			
			System.out.println("\nFirst Maximum Occured on position = " + (Max_First_Occurrence + 1));
			System.out.println("Last Minimum Occured on position = " + (Min_Last_Occurrence + 1));	
	   }
	}
}