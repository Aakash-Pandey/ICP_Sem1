public class A4Q9 {
public static void main(String[] args) {

	int sum = 0;
	for(int lol = 1; lol<1000; lol++)
	{
		
		if((lol%3==0)||(lol%5==0))
		{
			System.out.println(" "+lol);
			sum = sum+lol;
		}
		
	}
	System.out.print("sum = "+sum);
}}