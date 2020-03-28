//->Problem Statement: Employee Wage Computation.
//->Author: Sagar Gupta 
//->Date: Mar 2020 

public class employeeWage
{
	public static final int IS_PART_TIME=1;

	public void multipleCompanies( String name, int MAX_HRS_MONTH, int EMP_WAGE_PER_HRS, int NUM_WORKING_DAYS )
	{
		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays= 0;
		int totalEmpWage=0;
		//Computation
		while (totalEmpHrs <= MAX_HRS_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
		{
		
		totalWorkingDays++;
		int check = (int) Math.floor(Math.random() * 10) % 2;

			//Condition using Switch case.
			switch (check)
			 {

				case IS_PART_TIME :
					System.out.println("Employee Is Present..!");
					empHrs = 8;
					break;

				default :
					System.out.println("Employee Is Abesent..!");
					empHrs=0;
		
			}
			//Calculating daily wages
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays);
			System.out.println("empHr: " +empHrs);
		}
		totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HRS;
		System.out.println("Company name is " +name);
		System.out.println("Total Employee Wage is= "+totalEmpWage);
		System.out.println("");
	}
	

	public static void main(String[] args) {
		

		System.out.println("Employe Wage Computation");

		employeeWage emp = new employeeWage();
		emp.multipleCompanies("TCS",2,100,10);
		emp.multipleCompanies("Bridgelabz",3,20,5);
	}
}