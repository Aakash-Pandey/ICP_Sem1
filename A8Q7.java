import java.util.Scanner;
public class A8Q7{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter order of matrix: ");
		int order = sc.nextInt();
		
		System.out.println("\n\tEnter info of "+ order +" X "+ order+ " matrix: ");
		int matrix[][] = new int [order][order];
		for(int i = 0; i < order; i++)
		{
			for(int j = 0; j < order; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < order; i++)
		{
			for(int j = 0; j < order; j++)
			{
			  System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n\t\tTranspose of Matrix: ");
		
		int temp = 0;
		for(int i = 0; i < order; i++)
		{
			for(int j = 0; j < i; j++)           //Before j < i it was Swapping twice.
			{
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i = 0; i < order; i++)
		{
			for(int j = 0; j < order; j++)
			{
			  System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}



/* 1st iteration for(i = 0; i < row; i++) i.e. for(i = 0; 0<3; i++) OUTER LOOP
   1st iteration for(j = 0; j < i ; j++)  i.e. for(j = 0; 0<0; j++) INNER LOOP
   
    Break as 0 is not less than 0
    
    2nd iteration for(i = 1; i < row; i++) i.e. for(i = 1; 1<3; i++) OUTER LOOP
    1st iteration for(j = 0; j < i; j++)   i.e. for(j = 0; 0<1; j++) INNER LOOP
    
     temp = matrix[i][j]; i.e. temp = matrix[1][0] i.e. temp = ______
     matrix[i][j] = matrix[j][i]; i.e. matrix[1][0] = matrix[0][1] i.e. matrix[1][0] = _____
     matrix[j][i] = temp; i.e. matrix[0][1] = ______
     
     2nd iteration for(j = 1; j < i; j++) i.e. for(j = 1; 1<1; j++) INNER LOOP
     
     Now we break out of inner loop and then to outer loop.
   */