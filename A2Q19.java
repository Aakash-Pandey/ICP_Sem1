public class A2Q19 {

	public static void main(String[] args) {
		
/*Enter the basic salary of an employee of an organization through the command prompt. His dearness 
 allowance (DA) is 40% of basic salary, and house rent allowance (HRA) is 20% of basic salary. Write a 
 java program to calculate his gross salary.*/
		
		double BasicSalary = Double.parseDouble(args[0]);

		double DernessAllowancea = (0.4*BasicSalary);

		double HouseRentAllowance = (0.2*BasicSalary);

		double GrossSalary = (BasicSalary+DernessAllowancea+HouseRentAllowance);

		System.out.println(GrossSalary);

	}
	
	}