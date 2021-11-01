
public class A4Q17{

	public static void main(String[] args) {
		
		for(int kk=1;kk<=10;kk++)
		{
			for(int ff=1;ff<=10;ff++)
			{
				if(ff%kk==0||kk%ff==0)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
		          System.out.println(kk);
	    }
		
	
	}

}
