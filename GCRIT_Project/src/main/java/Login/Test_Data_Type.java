package Login;

public class Test_Data_Type {

	public static void main(String[] args) {

		int salary; /// declaration 
		salary = 5000;  //// initialization
		
		String name = "Cornelious";
		String salary2 = "USD $1,20,000";
		
		System.out.println(name+ " salary is "+salary2);
		
		System.out.println(salary);
		
		/// how to convert string to integer
		
		String salary3  = "5000";
		int mysalary = Integer.parseInt(salary3);
		
		int oviesalary  = mysalary/3;
		System.out.println(oviesalary);
		
		/// how to convert string into double
		
		String salary4  = "15000.66";
		double jcsalary = Double.parseDouble(salary4);
		double arghaslaary = jcsalary*2;
				System.out.println(arghaslaary);
	}

}
