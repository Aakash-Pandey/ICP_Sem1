public class A2Q23 {

	   public static void main(String[] args) {
		   
/*Write a java program that takes three integer values from the command line and prints them in ascending 
  order. Use Math.min() and Math.max().*/
		   
		 int A = Integer.parseInt(args[0]);
		 
		 int B = Integer.parseInt(args[1]);
		 
		 int C = Integer.parseInt(args[2]);
		 
		 int D = Math.min(A, (Math.min(B, C)));
		 
		 int E = Math.max(A, (Math.max(B, C)));
			
		 int F = ((A + B + C) - D - E); 
		 
		 System.out.println(D + "<" + F + "<" + E);
		    
		      }

      }