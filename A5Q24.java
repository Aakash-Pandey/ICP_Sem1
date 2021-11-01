import java.util.Scanner;
public class A5Q24{
	public static void main (String[]args){
		Scanner cube = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int N = cube.nextInt();
		
		for(int a = 1; a<=N; a++)
		{
			int a3 = a*a*a;
			    if(a3 > N)break;
			        
			    for(int b = 1; b<=N; b++)
				{
					int b3 = b*b*b;
					    if(a3 + b3 > N)break;
					    
					    for (int c = a + 1; c<=N; c++)
					    {
					    	 int c3 = c*c*c;
					    	 if(c3 > a3 + b3)break;
					    	 
					    	 
					    	    for (int d = c; d<=N; d++)
							      {
							    	 int d3 = d*d*d;
							    	 if(c3 + d3 > a3 + b3)break;
							    	 
							    	 
							    	    if(a3 + b3 == c3 + d3)
				    	                  {
				    	            	    System.out.println(a+"^3 + "+b+"^3  =  "+c+"^3 + "+d+"^3"); 
				    	                  }
					              }
				         }
			     }
		 }
	}
}