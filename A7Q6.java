import java.util.Scanner;

public class A7Q6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int arr_size = sc.nextInt();
		int value [] = new int[arr_size];
		System.out.println("Array Elements are: ");
		for(int i = 0; i<arr_size; i++)
		   {
			 value[i] = sc.nextInt();
		   }
		
		int abc[] = Reverse(value, arr_size);
		
		for(int i = 0; i<arr_size; i++)
		{
			System.out.print(abc[i] + " ");
		}
	}
	
	public static int[] Reverse(int [] value, int arr_size)
	{
		for(int i = 0, j = arr_size - 1; i<j ; i++, j--)
		{
			value[i] = value[i] ^ value[j];
			value[j] = value[i] ^ value[j];
			value[i] = value[i] ^ value[j];
		}
		return value;
	}
}