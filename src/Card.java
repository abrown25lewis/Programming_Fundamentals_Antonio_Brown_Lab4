/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 4
 */


import java.util.Random;

public class Card {
	
	// Declaring the suit and faceValue which will come together
	// to make the card
	public String faceValue, suit;
	
	static Random random = new Random();
	
	// Constructor to establish the makeup of the card
	public Card(String faceValue, String suit) {
		
		// Objects suit and faceValue are refereeing to themselves
		this.faceValue = faceValue;
		this.suit = suit;
	
	}
	
	// Method that will return each faceValue
	public String getfaceValue() {
		
		return faceValue;	
	}
	
	// Method that will return each cards suit
	public String getsuit() {
		
		return suit;
	}
	
	public void setC(String faceValue, String suit) {
		
		this.faceValue = faceValue;
		this.suit = suit;
	
	}
	
	public String toString() {
		
		return " The Cards suit is: " + suit + " The faceValue is: " + faceValue; 
		
	}
	
	public static void main(String[] args) {
		
		
		String[] faceValue = {"K","Q","J","10","9","8","7","6","5","4","3","2", "A"}; 
		
		String[] suit = {"Diamond", "Spade", "Heart", "Clubs"};
		
		for(int c = 1; c <= 5; c++) {
			
			// This is creating a new card object that is defined 
			Card card = new Card(faceValue[random.nextInt(faceValue.length)], suit[random.nextInt(suit.length)]);
			
            System.out.println(card);
        }
		

	}

}
