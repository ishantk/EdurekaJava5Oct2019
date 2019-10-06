
public class PopulationCounter {

	public static void main(String[] args) {
		
		// Consider : 5 cities in 1 state
		// int state1Population = ?
		
		// 5 Single Value Containers representing population of 5 cities
		/*
		int city1Pop = 1234123;
		int city2Pop = 2234222;
		int city3Pop = 3442133;
		int city4Pop = 5234211;
		int city5Pop = 3234453;*/

		// We will use a better technique to store data
		
		// Arrays | 1-Dimensional Array
		int[] state1Population = {1234123, 2234222, 3442133, 5234211, 3234453};
		int[] state2Population = {2234111, 3234124, 4442134, 7234241, 4234499};
		
		// In case we have a country for which we need to calculate population
		// And if we have 30 states it means we now need to create 30 arrays
		// this is again a re-work and repetition of same code again and again
		
		// Array of Arrays | 2-Dimensional Array
		int[][] countryPopulation = {
										// 0		1		2		3		  4
										{1234123, 2234222, 3442133, 5234211, 3234453}, // 0
										
										// 0		1		2		3		  4
										{2234111, 3234124, 4442134, 7234241, 4234499}  // 1	
									};
		
		System.out.println(">> Length of state1Population is: "+state1Population.length);		// 5
		System.out.println(">> Length of countryPopulation is: "+countryPopulation.length);		// 2
		
		System.out.println(">> state1Population is: "+state1Population);				// HashCode
		System.out.println(">> countryPopulation is: "+countryPopulation);				// HashCode
		System.out.println(">> countryPopulation[0] is: "+countryPopulation[0]);		// HashCode
		System.out.println(">> countryPopulation[1] is: "+countryPopulation[1]);		// HashCode
		
		System.out.println(">> countryPopulation[0][1] is: "+countryPopulation[0][1]);	// 2234222
		System.out.println(">> countryPopulation[1][1] is: "+countryPopulation[1][1]);	// 3234124
		
		// Update Data in 2-D Arrays :)
		countryPopulation[0][1] = 777777;
		
		System.out.println(">> countryPopulation[0][1] now is: "+countryPopulation[0][1]);	// 2234222
		
		// Image is an Example of Multi Dimension Array
		// 1 Pixel means => {125, 100, 212} i.e. RGB Value
		// 12 Mega Pixel Image ????
		
		int[][] data = new int[5][3];
		// 5 1-d arrays with each array having 3 elements where all the values will be 0
		System.out.println(">> data[3][1] is: "+data[3][1]);
		
		
		// 3-D Array
		// Array of Array of Arrays
		int[][][] worldPopulation ={ 
			
									{
										// 0		1		2		3		  4
										{1234123, 2234222, 3442133, 5234211, 3234453}, // 0
																								// 0
										// 0		1		2		3		  4
										{2234111, 3234124, 4442134, 7234241, 4234499}  // 1	
									},
									
									{
										// 0		1		2		3		  4
										{1234123, 2234222, 3442133, 5234211, 3234453}, // 0
																								// 1
										// 0		1		2		3		  4
										{2234111, 3234124, 4442134, 7234241, 4234499}  // 1	
									}
			
		};

		System.out.println(">> worldPopulation[1][1][2]: "+worldPopulation[1][1][2]); // 4442134
		
		
		// PS: Storage Containers i.e. Single Value and Multi Value !!
	}

}
