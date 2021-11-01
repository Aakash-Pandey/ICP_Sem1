public class A5Q3{
	public static void main(String[] args) {
	
		int pp,sum=0;
		for(pp=100;pp<=1000;pp++)
		{
			if(pp%5==0||pp%6==0)
			{
				System.out.print(pp+" ");
			
			sum++;
			if(sum%10==0)
				System.out.println();
			}
		}
		
	}
	}
