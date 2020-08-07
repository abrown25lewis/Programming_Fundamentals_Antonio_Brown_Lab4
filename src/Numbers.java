/* Programming Fundamentals 
 * Antonio Brown 
 * Programming Assignment 4
 */
import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {

		// Initilizing the array given in example
		int[] arrayNumbers = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };

		int arrlength = arrayNumbers.length;
		
		nextLargest(arrayNumbers, arrlength);
		
		
	}

	public static void nextLargest(int[] arrayNumbers, int arrlength) {

		// This will make a copy of the above array
		int[] newArray = Arrays.copyOf(arrayNumbers, arrlength);
		
		int getnext, x, y;

		// Sort Numbers in array smallest to largest
		Arrays.sort(newArray);

		for (x = 0; x < arrlength; x++) {

			// If there is not a higher number it will print max value
			getnext = Integer.MAX_VALUE;

			// Find next largest number in array
			for (y = 0; y < arrlength - 1; y++) {
				if (newArray[y] == arrayNumbers[x]) {
					getnext = newArray[y + 1];
					break;
				}
			}
			// Print out array and next largest number
			System.out.println(arrayNumbers[x] + ": " + getnext);
		}
	}
}