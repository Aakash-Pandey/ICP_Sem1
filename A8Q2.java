import java.util.Scanner;
public class A8Q2 {
     public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row & column: ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		System.out.println("Enter "+ row + " X " + column + " elements: ");
		
		double matrix [] [] = new double [row][column];
		for(int i = 0; i < row; i++)
		{
			for(int k = 0; k < column; k++)
			{
				matrix[i][k] = sc.nextDouble();
			}
		}
		
	System.out.print("\nEnter column index: ");
	int columnIndex = sc.nextInt();
		
    System.out.println("Sum of the elements at column "+ columnIndex + " is " + sumColumn(matrix, columnIndex));
    
    }
  public static double sumColumn(double[][] m, int columnIndex)
  {
	 double Sum = 0;
	 for(int i = 0; i < m.length; i++)
	 {
			 Sum = Sum + m[i][columnIndex];
	 }
	 return Sum;
  }
}
