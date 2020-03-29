//->Problem Statement: Employee Wage Computation.
//->Author: Sagar Gupta 
//->Date: Mar 2020 

public class employeeWage
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private final int EMP_WAGE_PER_HRS;
	private final int MAX_HRS_MONTH;
	private final int NUM_WORKING_DAYS;
	//Variable 
	private int totalEmpWage = 0;

	public employeeWage( int EMP_WAGE_PER_HRS,int MAX_HRS_MONTH,int NUM_WORKING_DAYS )
	{
		this.EMP_WAGE_PER_HRS=EMP_WAGE_PER_HRS;
		this.MAX_HRS_MONTH=MAX_HRS_MONTH;
		this.NUM_WORKING_DAYS=NUM_WORKING_DAYS;
	}
	
	

	private void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

	public static void multipleCompanies(employeeWage emp)
	{
		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		//Computation
		while (totalEmpHrs <= emp.MAX_HRS_MONTH && totalWorkingDays < emp.NUM_WORKING_DAYS)
		{
		
		totalWorkingDays++;
		int check = (int) Math.floor(Math.random() * 10) % 2;

			//Condition using Switch case.
			switch (check)
			 {
				case IS_PART_TIME :
					System.out.println("Employee Is Present..!");
					empHrs = 4;
					break;
				case IS_FULL_TIME :
					System.out.println("Employee Is Present..!");
					empHrs = 8;
					break;
				default :
					System.out.println("Employee Is Abesent..!");
					empHrs=0;
		
			}

			//Calculating daily wages
			totalEmpHrs += empHrs;
			empWage = empHrs * emp.EMP_WAGE_PER_HRS;
			totalEmpWage += empWage;
			System.out.println("Day: " + totalWorkingDays);
			System.out.println("Employee Hour: " +empHrs);
			System.out.println("Employee Wage: " +empWage);
		}
		emp.setTotalEmpWage(totalEmpWage);
		System.out.println("Total Employee Wage is= " + totalEmpWage + "\n");
	}
	
	//Main Method
	public static void main(String[] args) {
		

		System.out.println("Employe Wage Computation");

		employeeWage emp1 = new employeeWage(100,3,10);
		employeeWage2 emp2 = new employeeWage2(50,4,20);
		System.out.println("Employee Wage For TCS");
		multipleCompanies(emp1);
		System.out.println("Employee Wage For BRIDGELABZ");
		employeeWage2.multipleCompanies(emp2);
	}
}

class employeeWage2 
{

	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private final int EMP_WAGE_PER_HRS;
	private final int MAX_HRS_MONTH;
	private final int NUM_WORKING_DAYS;

	public employeeWage2( int EMP_WAGE_PER_HRS,int MAX_HRS_MONTH,int NUM_WORKING_DAYS )
	{
		this.EMP_WAGE_PER_HRS=EMP_WAGE_PER_HRS;
		this.MAX_HRS_MONTH=MAX_HRS_MONTH;
		this.NUM_WORKING_DAYS=NUM_WORKING_DAYS;
	}
	
	//Variable 
	private int totalEmpWage = 0;
	
	private void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

	public static void multipleCompanies(employeeWage2 emp)
	{
		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		//Computation
		while (totalEmpHrs <= emp.MAX_HRS_MONTH && totalWorkingDays < emp.NUM_WORKING_DAYS)
		{
		
		totalWorkingDays++;
		int check = (int) Math.floor(Math.random() * 10) % 2;

			//Condition using Switch case.
			switch (check)
			 {
				case IS_PART_TIME :
					System.out.println("Employee Is Present..!");
					empHrs = 4;
					break;
				case IS_FULL_TIME :
					System.out.println("Employee Is Present..!");
					empHrs = 8;
					break;
				default :
					System.out.println("Employee Is Abesent..!");
					empHrs=0;
		
			}

			//Calculating daily wages
			totalEmpHrs += empHrs;
			empWage = empHrs * emp.EMP_WAGE_PER_HRS;
			totalEmpWage += empWage;
			System.out.println("Day: " + totalWorkingDays);
			System.out.println("Employee Hour: " +empHrs);
			System.out.println("Employee Wage: " +empWage);
		}
		emp.setTotalEmpWage(totalEmpWage);
		System.out.println("Total Employee Wage is= " + totalEmpWage + "\n");
	}
}
