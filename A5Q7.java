import java.util.Scanner;
public class Vishwamitra {

	public static void main(String[] args) {
               Scanner nterms = new Scanner(System.in);
	        	System.out.print("Enter nth term: ");
	        	int n = nterms.nextInt();
	            int a = 1,c = 0,sum = 0;
	        	
	        	for(int k = 1; k<=2*n; k=k+2 )
	        	{
	        		c = a*k;
	        		a = -a;
	        		sum = sum + c;
	        		
	        	}
	        	System.out.print(sum);
	        }

	}