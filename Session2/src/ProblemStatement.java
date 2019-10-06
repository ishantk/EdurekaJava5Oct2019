
public class ProblemStatement {

	public static void main(String[] args) {
		
		// 2 1-D Arrays to hold data for 5 regions
		int[] demVotes = {126, 32, 230, 21, 200};
		int[] repVotes = {152, 85, 121, 215, 13};
		
		
		// 1 2-D Array
		int[][] votes = {
							// 0   1   2    3    4
							{126, 32, 230, 21, 200},	// 0 -> Dem
							{152, 85, 121, 215, 13}		// 1 -> Rep
					    };
		
		int demCount = 0;
		int repCount = 0;
		
		System.out.println(">> Length of Votes is: "+votes.length);
		
		// i:0 | i:1
		for(int i=0;i<votes.length;i++) { // how many times this loop will work : 2
			
			// i:0, j<5 i.e. j:0, 1, 2, 3, 4
			// i:1, j<5 i.e. j:0, 1, 2, 3, 4
			for(int j=0;j<votes[i].length;j++) {
				if(i==0) {
					demCount = demCount + votes[i][j]; // Adding all the elements of 0th array
				}else {
					repCount = repCount + votes[i][j]; // Adding all the elements of 1st array
				}
			}
			
		}
		
		System.out.println(">> Democratic Party Vote Count: "+demCount);
		System.out.println(">> Republic Party Vote Count: "+repCount);
		
		if(demCount > repCount) {
			System.out.println(">> Democratic Party Won");
		}else {
			System.out.println(">> Republic Party Won");
		}
			
		
		
	}

}
