public class A2Q21 {

      public static void main(String[] args) {
		
/*Write a java program that takes a double value t from the command line and prints the value of 
 sin (2t) + sin (3t).*/
    	  
          double degree = Double.parseDouble(args[0]);
    	  
    	  double t = Math.toRadians(degree);
    	  
    	  double value = Math.sin(2*t) + Math.sin(3*t);
    	  
    	  System.out.println(value);
	
	}
}