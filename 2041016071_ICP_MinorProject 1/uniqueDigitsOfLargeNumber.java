import java.util.Scanner;
public class uniqueDigitsOfLargeNumber {
public static void main(String[] args) {
	
/* Given a large number (n>0). You need to print the unique digits present in the number n, and the
   largest number possible using these unique digits. (You are not allowed to use array.) */
	
	    Scanner no=new Scanner(System.in);
		System.out.print("Enter a large number: ");
		String numb = no.next();                                   
		no.close();
		
		int length = numb.length();                                      
		char n;
		
		for (int i = 0; i < length; i++)
		     {
			     n = numb.charAt(i);
			     String str = "";
			     for (int k = 0; k <= i; k++) 
			        {
				      str += numb.charAt(k);
			        }
			          for (int j = i + 1; j < length; j++)
			          {
				           if (n == numb.charAt(j) && numb.charAt(j) != '*')
				           {
					           str += '*';
				           }
				           else
				           {
					           str += numb.charAt(j);
				           }
			           }
			     numb = str;
                 System.out.println((i + 1) + " iteration \"" + numb + "\"");
		     }
		         numb = numb.replace("*", "");
		         String lrg = "";
		         
		         int l = numb.length();
		                  for (int j = 0; j < l; j++)
		                  {
			                 int max = 0;
			                     for (int i = 0; i < l; i++)
			                   {

				                      if (numb.charAt(i) != '#')
				                      {
					                       if (max < Integer.parseInt("" + numb.charAt(i)))
					                       {
						                           max = Integer.parseInt("" + numb.charAt(i));
					                       }
				                       }
			                    }
			     lrg += max;
			     numb = numb.replace("" + max, "#");
		System.out.println((j + 1) + " iterartion   lrg:" + lrg + "         str:" + numb);
		}
	}
}