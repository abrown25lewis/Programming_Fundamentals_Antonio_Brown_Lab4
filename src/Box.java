
public class Box {

	// Initializing variable size
	int size;
	
	
	public static void main(String[] args) {

		// creating a new Box object
		Box myBox = new Box();

		// Setting the variable size for box size
		myBox.size = 5;
		
		// Invoking original printbox method
		myBox.printBox();
		//Invoking overloaded printbox method
		myBox.printBox('c');
	}

	// Original  method to print out box in '*'
	public void printBox() {

	int x, y;

		// creates loop for rows
		for (x = 0; x < size; x++) {

		// create loop for columns
		for (y = 0; y < size; y++) {

			System.out.print("*");
		}

			System.out.println("");
		}

	}

	// Creating Overloaded method 
	public void printBox(char c) {

	int x, y;

		// creates loop for rows
		for (x = 0; x < size; x++) {

		// create loop for columns
		for (y = 0; y < size; y++) {

			
			System.out.print('c');
		}

			System.out.println("");
		}

	}

	
}