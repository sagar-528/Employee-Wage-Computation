public class employeeWage
{
	public static void main(String[] args) {
		//Constatnt
		int IS_FULL_TIME = 1;
		//Random function
		double check = Math.floor(Math.random() * 10) % 2;

		//Condition for checking present or absent
		if ( check == IS_FULL_TIME ) 
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
		
	}
}