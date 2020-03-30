//#->Problem Statement: Employee Wage Computation
//#->Author: Sagar Gupta 
//#->Date: Mar 2020 

import java.util.*;


//interface for method computeWage
interface Calculation{

	void computeWage();
}


public class employeeWage implements Calculation
{

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	//Variables
	private static int empRatePerHour = 0, numWorkingDays = 0;
	private static int maxHrsInMonth = 0;
	ArrayList <CompanyEmpWage> employee = new ArrayList <CompanyEmpWage>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Employee Wage Computation\n");
		employeeWage ew = new employeeWage();
		int choose;
		System.out.println("Employee Variables are addded ");
			do{
				//Generate Employee rate.
				empRatePerHour = (int) (200 + Math.random() * 300);
		System.out.println("Employee Wage Computation\n");
	
		//Generate Employee rate.
		empRatePerHour = (int) (200 + Math.random() * 300);

				//Generate Employee working days.
				numWorkingDays = (int) (10 + Math.random() * 15);

				//Generate Employee work hours.
				maxHrsInMonth = (int) (100 + Math.random() * 150);
				ew.employee.add(new CompanyEmpWage(empRatePerHour, numWorkingDays, maxHrsInMonth));
			System.out.print("Employee added, do you want to add more ?(Yes-1 : No-0): ");
			choose = sc.nextInt();
		}while(choose == 1);

		}
			ew.computeWage();
	}

	//Calculates employee wage
	public void computeWage() {
		int empNo=1;

		for (CompanyEmpWage emp : employee)
		{
			int empHrs = 0, empWage = 0;
			int totalWorkingDays = 0, totalEmpHrs = 0;
			int totalEmpWage = 0;

			//Computation
			while (totalEmpHrs <= emp.getMaxHrsInMonth() && totalWorkingDays < emp.getNumWorkingDays()) 
				{
			
					totalWorkingDays++;
					int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;
					switch(empCheck) 
					{
						case IS_FULL_TIME:
							empHrs = 8;
							break;
						case IS_PART_TIME:
							empHrs = 4;
							break;
						default:
							empHrs = 0;
					}
				
				totalEmpHrs += empHrs;
				empWage = empHrs * emp.getEmpRatePerHour();
				totalEmpWage += empWage;
				}
			
			emp.setTotalEmpWage(totalEmpWage);
 			System.out.println("Monthly Wage of employee " + (empNo + 1) + ":" + totalEmpWage);
 			empNo++;
 		}
	}
}

class CompanyEmpWage {

	//CONSTANTS
	private final int EMP_RATE_PER_HOUR, NUM_WORKING_DAYS;
	private	final int MAX_HRS_IN_MONTH;

	//Variables
	private int totalEmpWage = 0;

	public void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;

	}

	public CompanyEmpWage(int EMP_RATE_PER_HOUR, int NUM_WORKING_DAYS, int MAX_HRS_IN_MONTH) {

		this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
		this.NUM_WORKING_DAYS = NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

	}

	public int getEmpRatePerHour() {

		return EMP_RATE_PER_HOUR;

	}

	public int getNumWorkingDays() {

		return NUM_WORKING_DAYS;

	}

	public int getMaxHrsInMonth() {

		return MAX_HRS_IN_MONTH;

	}

}
