import java.util.Scanner;
public class A6Q2{
    public static void main (String[]args){

        Scanner  pentagonalNumber = new Scanner(System.in);
        System.out.print("Enter the nth term: ");

        int N =  pentagonalNumber.nextInt(), noperline = 0;
        
        for (int d = 1; d<= N ; d++)
        {
        	System.out.print(getPentagonalNumber(d) + ", ");
        	
        	      noperline++;
        	if(noperline % 10 == 0)
				System.out.println();
        		
        }        
 }
    public static int getPentagonalNumber(int N)
    {
        return N =  (N * ( 3* N - 1 )) / 2; 
    }
}