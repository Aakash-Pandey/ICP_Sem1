public class A2Q20 {

      public static void main(String[] args) {
		
/*Write a java program that takes two int values m and d from the command line and prints true if day d of
 month m is between 3/20 and 6/20, false otherwise.*/
    	  
    	  int D = Integer.parseInt(args[0]);
    	  
    	  int M = Integer.parseInt(args[1]);
    	  
    	  boolean H = ((M==3) && ((D>=20)&&(31>=D))) || ((M==4) && ((D>=1)&&(30>=D))) || ((M==5) && ((D>=1)&&(31>=D))) || ((M==6) && ((D>=1)&&(20>=D)));
		
          System.out.println(H);
	}
	
	}
