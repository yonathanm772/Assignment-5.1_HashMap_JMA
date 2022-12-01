import java.util.Scanner;

/**
 * It instantiates an object of the ReadFile class and tests its methods.
 * @author Jonathan Moreira Alsina
 * @version 11/17/2022
 *
 */
public class Application {
	public static void main( String [] args) {
		
		ReadFile myDictionary = new ReadFile();
		Scanner scan = new Scanner( System.in);
		
		myDictionary.openFile();
		myDictionary.readFile();
		myDictionary.closeFile();
		
		System.out.println("\n----What word(s) would you like to search?----");
		
		myDictionary.findWord();
		
	}
}
