 import java.util.Scanner;
    public class  A5Q17{
        public static void main(String[] args) {
            Scanner newtonSquareroot = new Scanner(System.in);
            
            System.out.print("Enter a number,to compute square root of a number using Newton’s method: ");
            int number = newtonSquareroot.nextInt();
            double k1,k2;
            k2 = number/2;
            do
            {
            	k1 = k2;
            	k2 = (k1 + (number/k1))/2;
            	
            }while(Math.abs(k2 - k1)>0.000001);
             System.out.print(k2);		
     
        }
    }