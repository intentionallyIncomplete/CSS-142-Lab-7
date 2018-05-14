import java.util.*;
/**
 * This program will get a line of input from the user
 * and will print a copy of the line in which the first
 * character of each word has been changed to upper case.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CapitolizeOneString {

	private static String[] newStrings;

	public static void main(String[] args) {

		/*Scanner object for getting user input*/
		Scanner keyboardInput = new Scanner(System.in);
		String userGivenString;
		System.out.println("Enter a sentence");
		userGivenString = keyboardInput.nextLine();

		/*
		 * Static method calls
		 * printCaptialized(arg0){} --> Takes in a sentence provide by the user and returns it with each first letter
		 * capitalized. 
		 * 
		 * nameInitials(arg0){} --> Takes in a string and returns the initials
		 * */

		//printCapitalized(userGivenString);
		
		//nameInitials(userGivenString);
	}

	/**
	* This method will take in the String value that represents
	* the user input obtained from Scanner and 
	* split the words by the empty string (space) delimiter.
	* The split() method returns an array that is iterated over
	* and each first letter is converted to upper case and appended
	* to the rest of the string starting at the next position.
	*
	* @param userGivenString represents the input from the user that was obtained
	* using the Scanner object 
	* @see Scanner in main method
	* */
	static void printCapitalized(String userGivenString) {

		newStrings = userGivenString.split(" ");
		System.out.print("New Sentence: ");
		for (int i=0; i<newStrings.length;i++) {
			System.out.print(newStrings[i].toUpperCase().charAt(0) + newStrings[i].substring(1) + " ");
		}
		System.out.println("\nOld Sentence: " + userGivenString);
	}
	
	/**
	* This method here will take in a string value provided by the user
	* obtained by Scanner and split it using the split() method and a 
	* space as a delimiter. Once the strings are split, they are added
	* to an array and iterated over. While iterating, the first letters
	* are printed to the console capitalized and have a "." appended to
	* the end. 
	*
	* @see printCaptitalized()
	* */
	static void nameInitials(String userGivenString) {
		newStrings = userGivenString.split(" ");
		
		for(int i=0;i<newStrings.length;i++) {
			System.out.print(newStrings[i].toUpperCase().charAt(0) + ".");
		}
	}
	
	
}