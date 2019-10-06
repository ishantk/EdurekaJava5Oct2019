
public class Primitves {
	
	// int age = 20; // container in the block of class -> discussed in future

	public static void main(String[] args) {
		// Single Value Containers are also known as primitives
		// because they store value i.e. data 
		
		int salary;
		salary = 30000;
		
		int age = 20; // container in the block of main 
		double amountWithTaxes = 237.55;
		char ch = 'A';
		char rupee = '\u20b9'; // Unicode of Indian Rupee Symbol
		boolean isInternetEnabled = true; // false
		
		age = 33; // update operation do not use type of storage container
		
		System.out.println("salary is: "+salary);
		System.out.println("age is: "+age); // + is appending two things for us to be printed
		System.out.println("amountWithTaxes is: "+amountWithTaxes);
		System.out.println("ch is: "+ch);
		System.out.println("rupee is: "+rupee);
		System.out.println("isInternetEnabled: "+isInternetEnabled);

	}

}
