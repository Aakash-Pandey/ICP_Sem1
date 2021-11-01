public class A2Q22 {

		      public static void main(String[] args) {
/*Write a java program that calculates the monthly payments you would have to make over a 
given number of years to pay off a loan at a given interest rate compounded continuously, taking the
number of years t, the principal P, and the annual interest rate r as command-line arguments. The desired 
value is given by the formula Pe^rt. Use Math.exp ().*/
				    	  
			double t = Double.parseDouble(args[0]);
			//Time in years.
			
			double P = Double.parseDouble(args[1]);
			//Principal Amount.
			
			double r = Double.parseDouble(args[2]);
			//Rate of interest per year.
			
			double Amount = (P*(Math.exp(r*t)));
			
		    System.out.println(Amount);
		    
		      }

      }