public class A6Q10{
	public static void main (String[]args) {
		
		  char ch1 = '1';
		  char ch2 = 'Z';
		  int numberPerLine = 10;
		  printChars( ch1,  ch2, numberPerLine);
		
		
	}
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		  char ch = ch1;
		  numberPerLine = 0;
		  
		for( ch = '1' ; ch <= ch2; ch++ )
		{
			numberPerLine++;
			System.out.print(ch + " ");
			
			if(numberPerLine % 10 == 0)
			System.out.println();
	
		}
	}
}