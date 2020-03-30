//#->Problem Statement: Employee Wage Computation
//#->Author: Sagar Gupta 
//#->Date: Mar 2020 

public class employeeWage 
{

	//CONSTANTS
	private static final int IS_FULL_TIME = 1, IS_PART_TIME = 2;
	private static final int TOTAL_COMPANIES = 8;

	//Variables
	private static int empRatePerHour = 0, numWorkingDays = 0;
	private static int maxHrsInMonth = 0;

	public static void main(String[] args) {

		System.out.println("Employee Wage Computation\n");
	
		//Generate Employee rate.
		empRatePerHour = (int) (200 + Math.random() * 300);

		//Generate Employee working days.
		numWorkingDays = (int) (10 + Math.random() * 15);

		//Generate Employee work hours.
		maxHrsInMonth = (int) (100 + Math.random() * 150);

		CompanyEmpWage employee[] = new CompanyEmpWage [TOTAL_COMPANIES];
		for (int counter = 0; counter < TOTAL_COMPANIES; counter++) {
			employee[counter] = new CompanyEmpWage(empRatePerHour, numWorkingDays,
											 maxHrsInMonth);
			computeEmpWage(employee[counter], counter);
		}

	}

	//Calculates employee wage
	public static void computeEmpWage(CompanyEmpWage employee, int empNo) {

		int empHrs = 0, empWage = 0;
		int totalWorkingDays = 0, totalEmpHrs = 0;
		int totalEmpWage = 0;

		//Computation
		while (totalEmpHrs <= employee.getMaxHrsInMonth() &&
		       totalWorkingDays < employee.getNumWorkingDays()) {
			totalWorkingDays++;
			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;
			switch(empCheck) {
				case IS_FULL_TIME:
					System.out.println("Employee is present for Full time.....!");
					empHrs = 8;
					break;
				case IS_PART_TIME:
					System.out.println("Employee is present for Part time.....!");
					empHrs = 4;
					break;
				default:
					System.out.println("Employee is Abesent....!");
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * employee.getEmpRatePerHour();
			totalEmpWage += empWage;
		}
		employee.setTotalEmpWage(totalEmpWage);
 		System.out.println("Monthly Wage of employee " + (empNo + 1) + ":" + totalEmpWage);

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

	public CompanyEmpWage(int EMP_RATE_PER_HOUR,
						  int NUM_WORKING_DAYS,
						  int MAX_HRS_IN_MONTH) {

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
