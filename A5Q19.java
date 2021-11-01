import java.util.Scanner;
public class A5Q19{
	public static void main(String[] args) {
		Scanner Z = new Scanner(System.in);
		System.out.print("Enter a number to get it's binary representation: ");
		int binary = Z.nextInt();
				
		int rem;
		String s = "";
		
		while(binary != 0)
		{
			rem = binary % 2;
        	s = rem + s;
        	binary = binary/2;
		}
		System.out.print(s);
	}
}