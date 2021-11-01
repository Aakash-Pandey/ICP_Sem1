import java.util.Scanner;
public class A3Q12{
	public static void main(String[]args) {
		Scanner no = new Scanner(System.in);
		System.out.print("Enter a1,a2,a3: ");
		double a1 = no.nextDouble();
		double a2 = no.nextDouble();
		double a3 = no.nextDouble();
		double m;
		
		if(a2<a1||a3<a1||a3<a2)
		{
			if(a2<a1)
			 {
				m=a1;
			    a1=a2;
			    a2=m;
			 }
		
		    if(a3<a1)
		     {
		    	m=a1;
		    	a1=a3;
		    	a3=m;
		     }
		
		    if(a3<a2)
		     {
		    	m=a2;
		    	a2=a3;
		    	a3=m;
		     }
		}      
		System.out.print(a1+"<"+a2+"<"+a3);
	}
}