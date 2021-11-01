public class A8Q10 {
  public static void main(String[] args) {
	
	int binary[][] = new int[4][4];
	
	for(int i = 0; i< 4; i++)
	{
		for(int k = 0; k < 4; k++)
		{
			binary[i][k] = 0 + (int)((1 - 0 + 1) * Math.random());
		}
	}
	
	
	for(int i = 0; i< 4; i++)
	{
		for(int k = 0; k < 4; k++)
		{
			System.out.print(binary[i][k] + "  ");
		}
		System.out.println();
	}
	
	System.out.println("\n\nThe largest row index: " + MaxRow(binary));
	System.out.println("The largest column index: " + MaxColumn(binary));
	}
  
  private static int MaxRow(int binary[][])
  {
	  int sumRow = 0;
	  int previousSum = 0;
	  int MaxIndex = 0;
	  
	  for(int i = 0; i < 4; i++)
	  {
		  for(int j = 0; j < 4; j++)
		  {
			  sumRow = sumRow + binary[i][j];
		  }
		  if(previousSum < sumRow)
		  {
			  previousSum = sumRow;
			  MaxIndex = i;
		   }
		  sumRow = 0;
	  }
	  return MaxIndex;
  }
  
  private static int MaxColumn(int binary[][])
  {
	  int sumColumn = 0;
	  int previousSum = 0;
	  int MaxIndex = 0;
	  
	  for(int i = 0; i < 4; i++)
	  {
		  for(int j = 0; j < 4; j++)
		  {
			 sumColumn += binary[j][i];
		  }
		  if(previousSum < sumColumn)
		  {
			  previousSum = sumColumn;
			  MaxIndex = i;
		   }
		  sumColumn = 0;
	   }
	  return MaxIndex;
  }
}