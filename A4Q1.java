import java.util.Scanner;
public class A4Q1{
public static void main(String[] args) {
		
		Scanner message = new Scanner(System.in);
		System.out.print("Enter a message: ");
         String mess = message.nextLine();

        int messa=1;
        while(messa<=10)
    {
		if(messa%10==1)
		System.out.println(messa+"st"+" "+mess);
		else if (messa%10==2)
		System.out.println(messa+"nd"+" "+mess);
		else if (messa%10==3)
		System.out.println(messa+"rd"+" "+mess);
		else
		System.out.println(messa+"th"+" "+mess);
		messa++;
		 
     }
    message.close();
}
}