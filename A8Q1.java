import java.util.Scanner;
public class A8Q1{
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter M-by-N array: ");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int [] [] array = new int[row][column];
		System.out.println("Enter info of " + row*column + " elements:" );
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			  {
				 array[i][j] = sc.nextInt();
			  }
		}
		
		System.out.println("Tabular format: ");
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column; j++)
			  {
				 System.out.print(array[i][j] + " ");
			  }
			System.out.println();
		}
		
		
			
	}
}