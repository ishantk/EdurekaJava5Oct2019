// PS: MODEL means Data Storage Containers : Primitives and Arrays (References)
//     CONTROLLER means Logic 
//	   Logic: 1. Operators (Mathematics) |  2. Conditional Flows (Where to go)  | 3. Iterations (Looping something to get results)		


public class CondionalConstructs {

	public static void main(String[] args) {
		
		double amount = 235.55;
		// Offering a discount shall depend on a condition
		// We will offer flat 50 off for amount >= 200
		
		// Basic if/else
		if(amount >= 200) {
			double discount = amount - (0.5 * amount);
			System.out.println(">> FLAT 50 Off for You !! Please Pay \u20b9"+ (amount-discount));
		}else {
			System.out.println(">> No Discounts!! Please Pay \u20b9"+amount);
		}
		
		System.out.println("******************");
		
		// Use Case : Flat 50 if amount >= 1000
		//			  Flat 30 if amount >=500 and <1000
		//			  Flat 10 if amount >=200 and <500
		//            Nothing otherwise
		
		// Ladder if/else
		if(amount>=1000) {
			amount = amount - (0.5 * amount);
			System.out.println(">> FLAT 50 Off for You !! Please Pay \u20b9"+amount);
		}else if(amount>=500 && amount<1000) {
			amount = amount - (0.3 * amount);
			System.out.println(">> FLAT 30 Off for You !! Please Pay \u20b9"+amount);
		}else if(amount>=200 && amount<500) {
			amount = amount - (0.1 * amount);
			System.out.println(">> FLAT 10 Off for You !! Please Pay \u20b9"+amount);
		}else {
			System.out.println(">> No Discounts!! Please Pay \u20b9"+amount);
		}
		
		System.out.println("******************");
		
		
		// Nested if/else
		
		double billAmount = 755;
		boolean isPrimeUser = false;
		
		if(billAmount >= 500) {
			if(isPrimeUser) {
				billAmount = billAmount - (0.6*billAmount);
				System.out.println(">> FLAT 60 Off for Prime User !! Please Pay \u20b9"+billAmount);
			}else {
				billAmount = billAmount - (0.4*billAmount);
				System.out.println(">> FLAT 40 Off for You !! Please Pay \u20b9"+billAmount);
			}
		}else {
			System.out.println(">> No Discounts!! Please Pay \u20b9"+billAmount);
		}
		
		
		// Switch Case
		
		// Types of Cabs on OLA
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		int olaShare = 4;
		int olaBike = 5;
		
		int userSelection = olaBike;
		
		int baseFare = 100;
		int finalAmount = 0;
		
		switch(userSelection) {
		
			case 1:
				finalAmount = baseFare + 50;
				System.out.println(">> Please Pay \u20b9"+finalAmount+" for your OLA Micro cab !!");
				break;
			
			case 2:
				finalAmount = baseFare + 80;
				System.out.println(">> Please Pay \u20b9"+finalAmount+" for your OLA Mini cab !!");
				break;
			
			case 3:
				finalAmount = baseFare + 120;
				System.out.println(">> Please Pay \u20b9"+finalAmount+" for your OLA Sedan cab !!");
				break;
				
			case 4:
				finalAmount = baseFare - 50;
				System.out.println(">> Please Pay \u20b9"+finalAmount+" for your OLA Shared cab !!");
				break;
				
			case 5:
				finalAmount = baseFare - 60;
				System.out.println(">> Please Pay \u20b9"+finalAmount+" for your OLA Bike !!");
				break;
				
			default: // if none of above cases match :)
				System.out.println(">> Please select a valid cab first !!");
				break;
		
		}
		
		
		// Any Combinations as per our logic
		// Switch Case in if/else or switch case in switch case, here and there  !!
		

	}

}
