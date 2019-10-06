
public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		
		// Basic For loop where we have indexes and use index to access elements
		for(int i=0;i<array.length;i++) {
			System.out.println(">> array["+i+"] is: "+array[i]);
		}
		
		// Enhanced For Loop -> Works with Arrays and [Collections in java - a future discussion]
		// For-Each Loop
		// element can be any name of your choice
		// values at index gets copied automatically from 0 to n-1 one by one
		for(int element : array) {
			System.out.println(">> "+element);
		}

	}

}
