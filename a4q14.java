import java.util.Scanner;
public class a4q14{
public static void main(String[] args) {
	
Scanner ss = new Scanner(System.in);
System.out.print("Enter the value of N: ");
int N = ss.nextInt(),cc=0;
 
for(int jj=1;jj<=N;jj=jj*2)
{
	cc=jj;
}
System.out.println(cc);
}}