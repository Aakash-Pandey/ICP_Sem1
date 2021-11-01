import java.util.Scanner;

public class A7Q2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		
		int [] count = new int[101];
		int value;
		
		do
		{
			value = sc.nextInt();
			count[value] = count[value] + 1;
			
		}while(value != 0);
		
		Print(count);
	}
	
	public static void Print(int [] Occurence)
	{
		for(int i = 1; i<= 100; i++)
		{
			if(Occurence[i] != 0)
			System.out.println(i + " occurs "+ Occurence[i] + (Occurence[i] > 1 ? " times " : " time "));
		}
	}
}