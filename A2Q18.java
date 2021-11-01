public class A2Q18 {

        public static void main(String[] args) {
 /*Write a java program that takes three double values x, y, and z as command-line arguments and prints 
 true if the values are strictly ascending or descending (x < y < z or x > y > z), and false otherwise.*/

            double x = Double.parseDouble(args[0]);
            
            double y = Double.parseDouble(args[1]);
            
            double z = Double.parseDouble(args[2]);
            
          boolean TF = (x<y)&&(y<z)||(x>y)&&(y>z);
          
          System.out.println(TF);
 }
    }