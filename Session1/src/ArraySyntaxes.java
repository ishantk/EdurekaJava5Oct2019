
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// IMPLICIT SYNTAXES : Where new int[] is put by compiler for us
		// 1. Bracket before a1
		int[] a1 = {10, 20, 30, 40, 50}; // -> translated to int[] a1 = new int[]{10, 20, 30, 40, 50}; by compiler
		// 2. Bracket after a1
		int a2[] = {10, 20, 30, 40, 50};

		// EXPLICIT SYNTAXES : Where we put new int[] ourselves
		// 3. with new keyword
		int[] a3 = new int[]{10, 20, 30, 40, 50};
		// 4. with new keyword
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// new int[] -> create an array in the Heap.
		// if we dont put new int[] in Syntax, this will be added by compiler as in case of 1 and 2 
		
		// Declaring Arrays is different when we use brackets
		int a5[], a6[];
		int[] a7, a8;
		
		a5 = new int[5]; // We mention size and hence no values so all values are by default 0
		a6 = new int[7];
		
		a7 = new int[10];
		a8 = new int[20];
		
		// Allocate data to element i.e. update operation
		a5[1] = 654;
		
		// We can create Arrays with sizes instead of values
		// but when we give sizes, values will become 0.
		
		System.out.println(">> a5[1] is: "+a5[1]);
		//System.out.println(">> a5[10] is: "+a5[10]); // Accessing Index which does not exist -> Error at Run Time
		// ArrayIndexOutOfBoundsException is error which occurs at Run Time
		
		
		// PS: if we are giving values -> we can't put size
		//     if we are giving size -> we can't put values and all will be 0's which can later be updated with some new value

	}

}
