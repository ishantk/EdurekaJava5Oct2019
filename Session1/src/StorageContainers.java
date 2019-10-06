// Program i.e. Source Code is StorageContainers.java
public class StorageContainers {
	// main is a method or function
	// its is executed automatically when we run our java program
	// execution is taken care by JVM
	// whatever we write in main, is executed one by one in sequence :)
	public static void main(String[] args) {
		
		// Creational Statements : Container Creational Statements : Single Value Container Creation

		// 1. Create Storage Container
		// type name = value;
		byte age = 20;
		// age is name of Storage Container
		// byte defines the type of container and size of container
		// 20 is data or literal
		
		// byte is 8 bits i.e. 2pow8 -> 256
		// divide 256 by 2 -> -128 to 0 to 127 as range of data which can be stored in byte container
		
		System.out.println("age originally is: "+age);
		
		// 2. Update Storage Container
		age = 33; // new value is 33, and old value is replaced
		
		// 3. Read Data from Storage Container
		System.out.println("age after updation is: "+age);
		
		// 4. Delete Operation
		// Storage Containers will be deleted automatically when main finishes

		// PS: Storage Containers are created in RAM allocated to our program by JVM
		//     In RAM they are stored as Stack Arrangement
		
	}

}
