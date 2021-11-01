import java.util.Scanner;
public class A8Q3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 4 X 4 elements: ");
	double matrix[][] = new double[4][4];
	for(int i = 0; i<4; i++)
	   {
		 for(int j = 0; j<4; j++)
		 {
			 matrix[i][j] = sc.nextDouble();
		 }
		 
	    }
	
	  SumOfMajorDiagonal(matrix);
	}
   private static void SumOfMajorDiagonal(double [][] matrix)
   {
	   double sum = 0;
	   for(int i = 0; i < 4; i++)
	   {
		   for(int h = 0; h < 4; h++)
		   {
			   if(i == h)
				   sum = sum + matrix[i][h];
		   }
	   }
	   
	   System.out.println("Sum of the elements in the major diagonal is "+ sum);
   }
}