public class employeeWage
{
	//Constatnt
		public static final int EMP_WAGE_PER_HRS = 20;
		public static final int IS_PART_TIME = 1;
		public static final int PART_TIME_HRS= 8;
		public static final int NUM_WORKING_DAYS = 2;

	public static void main(String[] args) {

		//Variables
		int empHrs = 0;
		int totalWage = 0;

		//Computation
		for (int Counter = 0; Counter < NUM_WORKING_DAYS; Counter++){
		
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
			int empWage = EMP_WAGE_PER_HRS * empHrs;
			totalWage += empWage;
			System.out.println("The daily Employee wage is= "+empWage);
		}
		System.out.println("Total Employee Wage is= "+totalWage);
	}
}