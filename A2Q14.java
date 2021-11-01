public class A2Q14 {


	public static void main(String[] args) {
	
	//Write a java program that takes two positive integers as command-line arguments and prints true if either evenly divides the other.
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		boolean res = (a/b==0||b/a==0);
		System.out.println("result = " + res);
	}

	}