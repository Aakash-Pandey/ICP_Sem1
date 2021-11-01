import java.util.Scanner;
public class A4Q10{
	public static void main (String[]args) {
		
		Scanner uu = new Scanner(System.in);
		System.out.print("Enter a no. for which you want to find the multiplication table: ");
		int yy = uu.nextInt();
		
		for(int ll = 1; ll<=10; ll++)
		{
			System.out.println(yy+"x"+ll+"="+yy*ll);	
		}
		
	}
}