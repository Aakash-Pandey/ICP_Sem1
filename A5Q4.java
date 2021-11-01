import java.util.Scanner;
public class A5Q4 {
	public static void main(String[] args) {
	
		Scanner unspecifiedNumber = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		int Z = unspecifiedNumber.nextInt(),positive=0,negative=0,N=0;
		double sum=0;
		double avg=0;
		
		if(Z==0)
			System.out.print("No numbers are entered except 0");
		else
		{
			int i =0;
			while(Z!=0)
			{
				sum++;
				N += Z;
				
				if(Z>0)
					positive++;
					else
				{
					negative++;
				}
				Z = unspecifiedNumber.nextInt();
				i++;
				
			}
			
			System.out.println("The number of positive integers are: "+positive);
			System.out.println("The number of negative integers are: "+negative);
			System.out.println("The average is: "+N/sum);
		}
			
	}
}
