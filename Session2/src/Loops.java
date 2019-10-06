
public class Loops {

	public static void main(String[] args) {
		
		// Array contains salaries of just 5 employees !!
		
		//					  0		1	   2      3      4
		double[] salaries = {10000, 20000, 30000, 40000, 50000};
		
		// Requirement !!
		// We need to give increment of 20% in salary for the employees having salary < 35000
		// and 10% for the ones above 35000
		/*
		if(salaries[0] <=35000) {
			salaries[0] = salaries[0] + (0.20 * salaries[0]);
		}else {
			salaries[0] = salaries[0] + (0.10 * salaries[0]);
		}
		System.out.println(">> New Salary for Employee#1 is: \u20b9"+salaries[0]);
		

		
		if(salaries[1] <=35000) {
			salaries[1] = salaries[1] + (0.20 * salaries[1]);
		}else {
			salaries[1] = salaries[1] + (0.10 * salaries[1]);
		}
		System.out.println(">> New Salary for Employee#2 is: \u20b9"+salaries[1]);

		
		if(salaries[2] <=35000) {
			salaries[2] = salaries[2] + (0.20 * salaries[2]);
		}else {
			salaries[2] = salaries[2] + (0.10 * salaries[2]);
		}
		System.out.println(">> New Salary for Employee#3 is: \u20b9"+salaries[2]);

		
	
		if(salaries[3] <=35000) {
			salaries[3] = salaries[3] + (0.20 * salaries[3]);
		}else {
			salaries[3] = salaries[3] + (0.10 * salaries[3]);
		}

		System.out.println(">> New Salary for Employee#4 is: \u20b9"+salaries[3]);
		
		if(salaries[4] <=35000) {
			salaries[4] = salaries[4] + (0.20 * salaries[4]);
		}else {
			salaries[4] = salaries[4] + (0.10 * salaries[4]);
		}

		System.out.println(">> New Salary for Employee#5 is: \u20b9"+salaries[4]);
		*/
		
		// Challenge : We are writing the same code again and again !!
		//             Further, if we have a list of 5000 salaries, we may not write the program than !!
		
		// Solution : Use Loops
		// while or for or do-While loop
		
		/*
		int i = 0;
		
		// Check the Condition at the Entry
		while(i < salaries.length) { // initial value of i is 0 which yields true
			
			if(salaries[i] <=35000) {
				salaries[i] = salaries[i] + (0.20 * salaries[i]);
			}else {
				salaries[i] = salaries[i] + (0.10 * salaries[i]);
			}
			
			System.out.println(">> New Salary for Employee#"+(i+1)+" is: \u20b9"+salaries[i]);
			
			i++; // i = i+1
		}
		*/
		
		// PS: Why we use loops: to write repetitive logic to save our time !!
		
		// do-while will be executed on a min of 1 even if condition isn't satisfied !!
		/*
		int i = 0;
		
		do {
			if(salaries[i] <=35000) {
				salaries[i] = salaries[i] + (0.20 * salaries[i]);
			}else {
				salaries[i] = salaries[i] + (0.10 * salaries[i]);
			}
			
			System.out.println(">> New Salary for Employee#"+(i+1)+" is: \u20b9"+salaries[i]);
			
			i++; // i = i+1
		}while(i < salaries.length); // Check the Condition at the Exit
		
		*/
		
		
		for(int i=0;i<salaries.length;i++) {
			
			if(salaries[i] <=35000) {
				salaries[i] = salaries[i] + (0.20 * salaries[i]);
			}else {
				salaries[i] = salaries[i] + (0.10 * salaries[i]);
			}
			
			System.out.println(">> New Salary for Employee#"+(i+1)+" is: \u20b9"+salaries[i]);
		}
		
	} // main ends here

} // class ends here
