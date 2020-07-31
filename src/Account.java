/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 4
 */

public class Account {

	// Initializing numAccount to a static int
	static int numAccounts;

	// Constructor Method
	Account() {

		// Adds 1 for every account added
		numAccounts = numAccounts + 1;

	}

	// Method that will return each new account
	public static int getNumAccounts() {

		return numAccounts;

	}

	// Main method
	public static void main(String[] args) {

		// Created 5 new objects (accounts)
		Account NAC1 = new Account();
		Account NAC2 = new Account();
		Account NAC3 = new Account();
		Account NAC4 = new Account();
		Account NAC5 = new Account();
		
		

		// Prints out the number of accounts
		System.out.print("There are currently " + getNumAccounts() + " accounts.");

	}

}
