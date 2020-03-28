public class employeeWage
{
	public static void main(String[] args) {
		//Constatnt
		int IS_FULL_TIME = 1;
		int EMP_WAGE_PER_HRS = 20;
		int IS_PART_TIME = 2;

		//Variables
		int empHrs = 0;

		//Random function
		double check = Math.floor(Math.random() * 10) % 2;

		//Condition for checking present or absent
		if ( check == IS_FULL_TIME ) 
			empHrs = 8;
		else if ( check == IS_PART_TIME )
			empHrs = 8;
		else
			empHrs=0;
		
		//Calculating daily wages
		int empWage = EMP_WAGE_PER_HRS * empHrs;
		System.out.println("The daily Employee wage is= "+empWage);
	}
}