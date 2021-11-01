import java.util.Scanner;
public class A4Q4 {

	public static void main(String[] args) {
		
		Scanner count = new Scanner(System.in);
		
		System.out.print("count from: ");
		int x = count.nextInt();
		
		System.out.print("count upto: ");
		int y = count.nextInt();
		
		System.out.print("count by: ");
		int z = count.nextInt();
		
    for(x = x; x<=y ; x = x+z)
    {
    	
    	System.out.println(x);	
    }

	}

}
