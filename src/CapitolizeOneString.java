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


    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);
        String userGivenString;
        System.out.println("Enter a sentence");
        userGivenString = keyboardInput.nextLine();
        printCapitalized(userGivenString);
    }

    static void printCapitalized(String userGivenString) {
        System.out.println("Words: " + userGivenString);

    }
}