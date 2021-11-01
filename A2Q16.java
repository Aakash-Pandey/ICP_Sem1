public class A2Q16 {

        public static void main(String[] args) {
 //Write a java program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).

            int a = Integer.parseInt(args[0]);

            int b = Integer.parseInt(args[1]);

            int c = a + (int)((b-a)*Math.random());
            
            int d = a + (int)((b-a)*Math.random());

            System.out.println("Result=" + (c+d));
        
 }
    }