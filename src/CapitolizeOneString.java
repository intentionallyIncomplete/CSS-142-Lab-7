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
		//String letterToFind;
		System.out.println("Enter a sentence");

		userGivenString = keyboardInput.nextLine();

		//System.out.println("Enter a letter to find in the string");

		//letterToFind = keyboardInput.nextLine();

		/*
		 * Static method calls
		 * printCaptialized(){} <p> Takes in a sentence provide by the user and returns it with each first letter
		 * capitalized.</p> 
		 * 
		 * nameInitials(){} <p> Takes in a string and returns the initials</p>
		 * 
		 * letterCount() <p> Takes in a full sentence or string and a single letter to find
		 * and then counts the number of times it appears. The method will print the count
		 * to the console. </p>
		 * 
		 * lexLargest() <p> Uses a nested for loop to go over one string
		 * at a time and compare to another in the sequence. String that
		 * is largest is returned (the one closest to the end of the alphabet)</p>
		 * 
		 * largestBy() <p> Uses a given string to check for which word in the sequence is
		 * the longest. Then prints that value to the console.</p>
		 * */

		//printCapitalized(userGivenString);

		//nameInitials(userGivenString);

		/*
		 * Basic error checking. Just making sure 
		 * the letter is only a letter, not another string.
		 * */
		//		if(letterToFind.length() > 1) {
		//			System.out.println("that's not one letter, try again. Please just "
		//					+ "one letter.");
		//		}else {
		//			letterCount(userGivenString, letterToFind);
		//		}

		//lexLargest(userGivenString);
		
		//largestBy(userGivenString);
		
		charsIndex(userGivenString);
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

	/**
	 * This method will take in two strings as values and tell
	 * the console how many times one appeared in the other. The logic
	 * used here is that splitting the sentence on the letter specified
	 * should return an array with the same length as the number of times
	 * the string was split. Thus meaning that the length of the array
	 * should be the same as the number of times that character appeared.
	 *
	 * @param letterToFind is the single letter provided by the user
	 * to find within the string that was provided previously.
	 * @see main
	 * */
	static void letterCount(String userGivenString, String letterToFind) {
		newStrings = userGivenString.split(letterToFind);
		int counter = 0;
		for(int i=0;i<newStrings.length;i++) {
			counter += 1;
		}
		System.out.println("the letter '" + letterToFind + "' appears " + counter
				+ " times in the string: '" + userGivenString + "'");
	}

	/**
	 * This method takes in a single parameter that represents
	 * the string given by the user using Scanner. The string is split
	 * by the empty string (space) delimiter and each word is compared
	 * against using the compareTo() method. An integer value is returned
	 * and a new String is assigned to the value of the string that 
	 * comes AFTER the one, lexicographically, in the list. 
	 *
	 * @param lexLargestString will hold the value of the string that comes
	 * later in the alphabet than the others in the list. 
	 * @see Scanner in main method
	 * */

	static void lexLargest(String userGivenString) {
		newStrings = userGivenString.split(" ");
		String lexLargestString = "";
		for(int i=0;i<newStrings.length;i++) {
			for(int j=0;j<newStrings.length;j++) {
//				System.out.println("run: '" + newStrings[i] + "' against: '" + newStrings[j] + "' " +
//						newStrings[i].compareTo(newStrings[j]));

				if(newStrings[j].compareTo(newStrings[i]) <= 0) {
					lexLargestString = newStrings[j];
				}
			}
		}
		System.out.println(lexLargestString);
	}


	/**
	 * This method will check each string against the next
	 * in the sequence and compare their lengths. The
	 * String with the larger of the two being compared
	 * is assigned to the new String value "longerString"
	 * and printed to the console at the end. 
	 * 
	 * */

	static void largestBy(String userGivenString) {
		newStrings = userGivenString.split(" ");
		String longerString = "";
		for(int i=0;i<newStrings.length;i++) {
			for (int j=0;j<newStrings.length;j++) {
				if(newStrings[i].length() <= newStrings[j].length()) {
					longerString = newStrings[j];
				}
			}
		}
		System.out.println(longerString);
	}
	
	/**
	* This method will take in a string provided by the user
	* and print out the position in the array of where
	* each letter is first located.
	* */
	
	static void charsIndex(String userGivenString) {
		
	}	
}