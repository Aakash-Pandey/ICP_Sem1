import java.util.Scanner;
public class A7Q1{
	public static void main(String[]args) {
		Scanner N = new Scanner (System.in);
		System.out.print("Enter no. of elements: ");
		int nterm = N.nextInt();
		
		double []random = new double [nterm]; 
		double sum = 0;
		
		for(int i = 0; i < nterm; i++ )
		{
			random[i] = Math.random();
			System.out.println(random[i]+ " ");
			sum = sum + random[i];
                }
        System.out.println("Sum =" + sum );

		double avg = sum/nterm;
		System.out.print("Average ="+avg);
	}
}