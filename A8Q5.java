import java.util.*;
public class A8Q5 {
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	System.out.print("Enter number of Students: ");
	int Student = sc.nextInt();
	
	System.out.print("Enter number of Subject: ");
	int Subject = sc.nextInt();
	
	
	double Report[][] = new double[Student + 1][Subject + 1];
	
	System.out.println("Enter Marks: ");
	for(int i = 0; i < Student; i++)
	{
		for(int k = 0; k < Subject; k++)
		{
			Report[i][k] = sc.nextInt();
		}
	}
	
	studentAverageMark(Report, Student, Subject);
	averageTestMark(Report, Student, Subject);
	
	System.out.println("\n\tStudent's Report: \n");
	for(int i = 0; i<Student + 1; i++)
	{
		for(int y = 0; y<Subject + 1; y++)
		{
			System.out.print(Report[i][y] + "   ");
		}
		System.out.println();
	}
	

}
  private static void studentAverageMark(double Report[][], int Student, int Subject)
  {
	  double sumRow = 0;
	 for(int i = 0; i<Student; i++)
	 { for(int j = 0; j < Subject; j++)
	   {
		  sumRow = sumRow + Report[i][j];
	   }
	 Report[i][Subject] = sumRow;
	 sumRow = 0;
	}
  }
  
  
  private static void averageTestMark(double Report[][], int Student, int Subject)
  {
	  double Sumcol = 0;
	  for(int j = 0; j < Subject; j++)
	  { 
		  for(int i = 0; i<Student; i++)
			   {
			      Sumcol = Sumcol + Report[i][j];
			      Report[Student][j] = Sumcol;
		       }
		     Sumcol = 0;
	   }
  }
}