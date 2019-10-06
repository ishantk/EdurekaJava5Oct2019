
public class Arrays {

	public static void main(String[] args) {
		
		// Container Creation Statements
		int johnsSalary = 30000;
		int jenniesSalary = 40000;
		int mikesSalary = 33750;
		int kiasSalary = 12375;
		int fionnasSalary = 54300;
		
						   // Computational Statement
		int familyIncome = johnsSalary + jenniesSalary + mikesSalary + kiasSalary + fionnasSalary;
		
		System.out.println(">> Family Income: "+familyIncome);
		
		// What in case we have to calculate how much a company pays to its employees in a month.
		// Assuming we have 5000 employees.
		// this is a challenge ? Why ? Because as a developer we cannot write 5000 single value containers !!
		// And doing an arithmetic operation will again be tough :(
		
		// As a Solution we use Arrays
		int[] salaries = {30000, 40000, 33750, 12375, 54300};
		// int[] -> Array
		// {} -> Hold Multiple Values
		// size is automatically computed to be the number of values you have put in i.e. 5
		
		System.out.println(">> salaries is: "+salaries);
		// salaries will not print data, rather print HashCode where array is in the Heap
		// salaries is a REFERENCE VARIABLE (hold HashCode and not the Value), created in Stack
		// array is multi value container in the Heap
		
		// Read data from Array
		// 1. Read the Length of Array
		System.out.println(">> Length of salaries is: "+salaries.length);
		
		// 2. Read elements of Array
		System.out.println(">> Element at 0th index is: "+salaries[0]);
		System.out.println(">> Element at 2nd index is: "+salaries[2]);
		
		// 3. Update elements of Array
		salaries[2] = 44312;
		System.out.println(">> Element at 2nd index now is: "+salaries[2]);
		
		// 4. Delete operations : As main finishes, data will be automatically deleted :)
		
		// RAM means temporary data storage. For any program, data is available temporarily :)

	}

}
