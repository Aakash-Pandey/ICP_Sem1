public class A5Q18 {
        public static void main(String[] args) {
            
 //Enter a number and k^th root, to compute k^th root of a number using Newton’s method
        	
            int number = Integer.parseInt(args[0]);
            int kth_root = Integer.parseInt(args[1]);
            
            double k1,k2;
            k2 = number/2;
            do
            {
            	k1 = k2;
            	k2 = ((kth_root - 1) * k1   +   (number/Math.pow(k1, (kth_root - 1))))/kth_root;
            	
            }while(Math.abs(k2 - k1)>0.000001);
             System.out.print(k2);		
     
        }
    }