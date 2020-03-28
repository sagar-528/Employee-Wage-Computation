public class employeeWage
{
	//Constatnt
		public static final int EMP_WAGE_PER_HRS = 20;
		public static final int IS_PART_TIME = 1;
		public static final int PART_TIME_HRS= 8;
		public static final int NUM_WORKING_DAYS = 2;
		public static final int MAX_HRS_MONTH = 10;

	public static void main(String[] args) {

		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays= 0;
		//Computation
		while (totalEmpHrs <= MAX_HRS_MONTH && totalWorkingDays < NUM_WORKING_DAYS){
		
		totalWorkingDays++;
		int check = (int) Math.floor(Math.random() * 10) % 2;

			//Condition using Switch case.
			switch (check) {

			case IS_PART_TIME :
				empHrs = PART_TIME_HRS;
				break;

			default :
				empHrs=0;
		
			}

			//Calculating daily wages
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "empHr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HRS;
		System.out.println("Total Employee Wage is= "+totalEmpWage);
	}
}