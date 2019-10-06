
public class BreakContinue {

	public static void main(String[] args) {
		
		// 10 different shoe with prices
		// 				 0		1     2     3    4     5     6     7     8     9
		int[] prices = {1200, 3500, 2200, 1950, 5670, 3210, 6678, 1579, 4421, 5432};
		// Requirement is to find index of shoe with price as 3210 !! -> 5
		
		// Whats the problem ? for the index where match was found, thereafter loop should not work !!
		
		/*
		for(int i=0;i<prices.length;i++) {
			if(prices[i] == 3210) {
				System.out.println(">> index matched and found : "+i);
				break; // terminate the loop
			}else {
				System.out.println(">> index not matched : "+i);
			}
		}*/
		
		
		for(int i=0;i<prices.length;i++) {
			
			if(prices[i] != 3210) {
				continue; // will take us to the next iteration by skipping the statements below !!
			}
			
			System.out.println(">> Match Found : "+i);
			break;
		}
		

		// PS: break and continue shall work with while and do while as well !!
		
	}

}
