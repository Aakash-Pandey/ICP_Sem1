 import java.util.Scanner;
    public class A5Q16 
    {
        public static void main(String[] args) 
        {
            Scanner Z = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int N = Z.nextInt();
            		
     int rev = 0, rem;
     while (N != 0 )
            {
            	rem = N % 10;
            	rev = rev * 10 + rem;
            	N = N/10;
            	
            }
            System.out.print(rev);
        }
    }