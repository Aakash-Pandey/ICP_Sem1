import java.util.Scanner;
public class A5Q1{
	public static void main(String[]args) {
		Scanner table = new Scanner(System.in);
		System.out.print("Enter the value of N to print a table of the power of 2: ");
		int N = table.nextInt();
		for(int hh =0; hh<=N; hh++)
		{
			System.out.println(hh+"    "+(int)Math.pow(2, hh));
		}
		
	}
}