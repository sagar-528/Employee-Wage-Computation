public class employeeWage
{
	//Constatnt
		public static final int EMP_WAGE_PER_HRS = 20;
		public static final int IS_PART_TIME = 1;

	public static void main(String[] args) {

		//Variables
		int empHrs = 0;

		//Random function
		int check = (int) Math.floor(Math.random() * 10) % 2;

		//Condition using Switch case.
		switch (check) {

		case IS_PART_TIME :
			empHrs = 8;
			break;

		default :
			empHrs=0;
		
		}

		//Calculating daily wages
		int empWage = EMP_WAGE_PER_HRS * empHrs;
		System.out.println("The daily Employee wage is= "+empWage);
	}
}