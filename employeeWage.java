public class employeeWage
{
	//Constatnt
		public static final int EMP_WAGE_PER_HRS = 20;
		public static final int IS_PART_TIME = 1;
		public static final int PART_TIME_HRS= 8;
		public static final int NUM_WORKING_DAYS = 2;
		public static final int MAX_HRS_MONTH = 10;
		public static final int FULL_DAY_HRS = 8;
		public static final int IS_FULL_TIME = 1;

		//variable
		int empHrs = 0 ,empWage = 0;
		int totalWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays= 0;

		//Condition for checking present or absent
		public void checkEmployee()
		{
			double check = Math.floor(Math.random() * 10) % 2;

			if ( check == IS_PART_TIME) 
				System.out.println("Employee is present");
			else
				System.out.println("Employee is absent");
		}

		//Calculating daily wages
	public void DailyWage(){
		 empWage = EMP_WAGE_PER_HRS * FULL_DAY_HRS;
		System.out.println("The daily Employee wage is= "+empWage);
	}

	//Added PartTime.
	public void addPartTime(){
		
		double check = Math.floor(Math.random() * 10) % 2;
		if ( check == IS_FULL_TIME ) 
			empHrs = FULL_DAY_HRS;
		else if ( check == IS_PART_TIME )
			empHrs = PART_TIME_HRS;
		else
			empHrs=0;
		
		//Calculating daily wages
		empWage = EMP_WAGE_PER_HRS * empHrs;
		System.out.println("The daily Employee wage is= "+empWage);
	}

	//Condition using Switch case.
	public void usingSwitch(){

		int check = (int) Math.floor(Math.random() * 10) % 2;
		switch (check) {

		case IS_PART_TIME :
			empHrs = 8;
			break;

		default :
			empHrs=0;
		
		}

		//Calculating daily wages
		empWage = EMP_WAGE_PER_HRS * empHrs;
		System.out.println("The daily Employee wage is= "+empWage);
	}

	//Calculating total wage of employee.
	public void totalWage(){
			for (int Counter = 0; Counter < NUM_WORKING_DAYS; Counter++)
			{
		
			int check = (int) Math.floor(Math.random() * 10) % 2;

				//Condition using Switch case.
				switch (check) 
				{
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
	
	//Computation
	public void conditionTotalWage()
	{
		
		while (totalEmpHrs <= MAX_HRS_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
		{
			totalWorkingDays++;
			int check = (int) Math.floor(Math.random() * 10) % 2;

			//Condition using Switch case.
			switch (check) 
			{

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

	public static void main(String[] args) {

		System.out.println("Employe Wage Computation");

		employeeWage emp = new employeeWage();
		emp.checkEmployee();
		emp.conditionTotalWage();
	}
}