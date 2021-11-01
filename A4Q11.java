public class A4Q11 {
public static void main(String[] args) {

	int sum = 0,sqr = 0;
	for(int lol = 1; lol<=100; lol++)
   {
		sum = sum+lol;
		sqr = sqr + lol*lol;
	}
	
	System.out.println("The sum of the squares of the first ten natural numbers is: "+sqr);
	System.out.println("The square of the sum of the first ten natural numbers is: "+ sum*sum);
	System.out.println("Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is: "+(sum*sum-sqr ));
	
 }
}
