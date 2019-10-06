
public class Operators {

	public static void main(String[] args) {
		
		double amount = 550.0;
		double taxes = 0.18 * amount; // 18% of taxes
		
		double finalAmount = amount + taxes;
		
		System.out.println(">> Final Amount with taxes(\u20b9"+ taxes +") is: \u20b9"+finalAmount);
		
		int x = 10;
		int y = 3;
		int p = x/y;
		int z = x % y; // Remainder
		System.out.println(">> z is: "+z); // 1
		System.out.println(">> p is: "+p); // 3

		
		int age = 10;
		age++;	// age = age + 1 | Postfix
		++age;	// age = age + 1 | Prefix
		
		System.out.println(">> age is: "+age); // 12
		
		int year = 2019;
		System.out.println(year++);   // 2019 | year gets printed first and later it is incremented by 1
		//System.out.println(year);   // 2020
		
		System.out.println(++year); // 2021	  | year gets incremented first by 1 and later it is printed
		
		// -- decrement by 1 i.e. age-- -> age = age - 1
		
		// Assignment operators : +=, -=, *=, /=, %=
		year+=3; // year = year + 3
		System.out.println(">> year is : "+year); // 2024
		
		year%=2;
		System.out.println(">> year now is: "+year); // 0
		
		// Promo Codes on Food Delivery App
		// FLAT50 : is applicable only if your amount is greater than 200
		// ** FLAT50 : is applicable only if your amount is greater than 200 and less than 500
		// ** FLAT60 : is applicable only if your amount is greater than 500 
		
		System.out.println(">> Is Discount Available? "+ (finalAmount >= 200));
		System.out.println(">> Is Discount Available logical AND ? "+ ( (finalAmount >= 200) && (finalAmount<500) ) );
		System.out.println(">> Is Discount Available Logical OR ? "+ ( (finalAmount >= 200) || (finalAmount<500) ) );
		
		// Decimal			//  Binary		
		int n1 = 8;			// 	0 0 0 0  1 0 0 0
		int n2 = 12;		//  0 0 0 0  1 1 0 0 
		
		int n3 = n1 | n2;	//  0 0 0 0  1 1 0 0  // 12
		System.out.println(">> n3 is: "+n3);	  // 12	
		
		// PS: How Decimals i.e. base 10 can be converted to Binary i.e. Base 2 : Please Google Up !! :)
		
		
	}

}
