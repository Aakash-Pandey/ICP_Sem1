import java.util.Scanner;
public class A4Q2 {

	public static void main(String[] args) {
		
		Scanner message = new Scanner(System.in);
		System.out.print("Enter a message: ");

     String mess = message.nextLine();
     int no = Integer.parseInt(args[0]);
     
		for (int jj=1; jj<=no; jj++)
		{
		if ((jj%10 ==1)&&(jj%100!=11))
			System.out.println(jj+"st"+" "+mess);
		else if(( jj%10 ==2)&&(jj%100!=12))
			System.out.println(jj+"nd"+" "+mess);
		else if(( jj%10 ==3)&&(jj%100!=13))
			System.out.println(jj+"rd"+" "+mess);
		else 
			System.out.println(jj+"th"+" "+mess);
		}

	}

}
