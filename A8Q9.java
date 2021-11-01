import java.util.Arrays;
import java.util.Scanner;
public class A8Q9{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("\tMatrix A: ");
		System.out.print("Enter row: ");
		int A_row = sc.nextInt();
		System.out.print("Enter column: ");
	    int A_column = sc.nextInt();
		
	    System.out.println("\n\tEnter info: ");
	    double [][] A = new double [A_row][A_column];
		for(int i = 0; i < A_row; i++ )
		{
			for(int v = 0; v < A_column; v++)
			{
				A[i][v] = sc.nextDouble();
			}
		}
	    
		System.out.println("\n\tMatrix B: ");
		System.out.print("Enter column: ");
		int B_column = sc.nextInt();
		
/*product AB is defined, if the number of columns in matrix A is equal to the number of rows 
  in matrix B.*/
		double [][] B = new double[A_column][B_column];
		System.out.println("\n\tEnter info: ");
		for(int i = 0; i < A_column; i++)
		  {
			  for(int j = 0; j < B_column; j++)
			   {
				  B[i][j] = sc.nextDouble();
			   }
		  }
		
	System.out.println(" \n\t"+ Arrays.deepToString(multiplyMatrix(A, B, A_row, A_column, B_column)));
 }
		
	public static double[][] multiplyMatrix(double[][] a, double[][] b, int A_row, int A_column, int B_column)
	{
		double[][] c = new double[A_row][B_column];
		double sum = 0;
		
 	  for(int i = 0; i<A_row; i++)             //Needed for keep tracking 
 	  {                                       //of No. of rows from 1st Matrix and No. of
		  for(int j = 0; j<B_column; j++)     // column from 2nd Matrix.
		  {
			  for(int k = 0; k < A_column; k++)   //Needed for getting element of 1st matrix 
			  {                                   //and simultaneously getting element from
				  sum += a[i][k] * b[k][j];       // second matrix.
			  }
			  
			  c[i][j] = sum;
			  sum = 0;
		   }
		}
 	  return c;
	}
}