import java.util.Scanner;
public class Gem{

	public static void main(String[] args) {
	Scanner divisiblity = new Scanner(System.in);
	System.out.print("Enter a number to check it's divisblity for 9: ");
	
	int divisor = divisiblity.nextInt(),rem=0,sum=0;
	while(divisor>0)
	{
		rem=divisor%10;
		sum=sum+rem;
		divisor=divisor/10;
		System.out.println(rem);
		
	}
	System.out.println("sum of it's reminder= "+sum);
	if(sum%9==0)
		System.out.print("Number is divisible by 9");
	else
	    System.out.print("Number is not divisible by 9");
}

}