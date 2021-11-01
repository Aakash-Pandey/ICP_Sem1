import java.util.Arrays;
import java.util.Scanner;
public class A8Q6 {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	double [][] A = CreationOfMatrix();
	double [][] B = CreationOfMatrix();
	
	double [][] AplusB = addMatrix(A, B);
	
  System.out.println(Arrays.deepToString(A) + " + " + Arrays.deepToString(B) + " = " + Arrays.deepToString(AplusB));
	
	
}
    private static double[][] CreationOfMatrix()
    {
    	System.out.println("Enter info of "+ 3 +" X "+3 + " matrix: ");
    	double[][] Matrix = new double[3][3];
    	for(int i = 0; i<3; i++)
    	{
    		for(int j = 0; j<3; j++)
    		{
    			Matrix[i][j] = sc.nextDouble();
    		}
    	}
    	return Matrix;
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b)
    {
    	double c [][] = new double[3][3];
    	
    	for(int i = 0; i<3; i++)
    	{
    		for(int k = 0; k<3; k++)
    		{
    			c[i][k] = a[i][k] + b[i][k];
    		}
    	}
    	return c;
    }
}
