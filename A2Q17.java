public class A2Q17 {

	public static void main(String[] args) {

    /*Write a java program that takes three positive integers as command-line arguments and prints true if 
      any one of them is greater than or equal to the sum of the other two and false otherwise.*/
		
		int a = Integer.parseInt(args[0]);

		int b = Integer.parseInt(args[1]);

		int c = Integer.parseInt(args[2]);

		boolean result =(a>=b+c)||(b>= a+c)||(c>=a+b);

		System.out.println(result);

	}

    }