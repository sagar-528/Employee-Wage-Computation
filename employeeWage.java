public class employeeWage
{
	public static void main(String[] args) {
		//Constatnt
		int IS_FULL_TIME = 1;
		int EMP_WAGE_PER_HRS = 20;
		int FULL_DAY_HRS = 8;

		//Random function
		double check = Math.floor(Math.random() * 10) % 2;

		//Condition for checking present or absent
		if ( check == IS_FULL_TIME ) 
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		
		//Calculating daily wages
		int empWage = EMP_WAGE_PER_HRS * FULL_DAY_HRS;
		System.out.println("The daily Employee wage is= "+empWage);
	}
}