public class A4Q12{
public static void main(String[] args) {
	
	System.out.println("Enter");

	int sum = 0;
	   System.out.println("      log N \t         N \t      Nlog N \t         N2 \t N3 \t 2N");
	for(int N = 16;N<=2048;N = N+N )
      {
		
	  System.out.println(Math.log(N)+"\t"+N+"\t"+(N*(Math.log(N))+"\t"+Math.pow(N, 2)+"\t"+Math.pow(N, 3)+"\t"+Math.pow(2, N))); 
		
	}
	
	
}}