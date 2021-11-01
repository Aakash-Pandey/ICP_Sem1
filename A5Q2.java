import java.util.Scanner;
public class Space{
	public static void main(String[]args) {
		
		Scanner count = new Scanner(System.in);
		System.out.print("Enter the no. of Student: ");
		int N = count.nextInt(),sum=0,add=0;
		
		
		for(int hh =1; hh<=N; hh++)
		{
			System.out.print("Enter the Marks of the Student: ");
		    double mark = count.nextDouble();
			if(40<mark)
			{
				sum++;
				System.out.println("Pass");
				
			}
			else
			{
				add++;
				System.out.println("Fail");
				
			}
		}
		System.out.println("No. of student pass= "+sum);
		System.out.println("No. of student fail= "+add);
	}
}