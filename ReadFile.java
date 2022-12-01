/** 
 * A program that reads a file and inputs every word into a hash map.
 * @author Jonathan Moreira Alsina
 * @version 11/17/2022
 */

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFile {
	private Scanner scanFile;
	
	private HashMap<String, String> dictionary = new HashMap<String, String>();
	
	/**
	 * Opens the desired file and throws an exception if the file is not found 
	 */
	public void openFile() {
		try {
			//File path here
			scanFile = new Scanner( new File("words.txt"));
		}
		catch( Exception e) {
			System.out.println("Could not find file");
		}
	}
	
	/**
	 * It reads the file line by line, taking each line as a string and then partitioning it into two substrings.
	 * One is the word, and the other its definition.
	 */
	public void readFile() {
		while(scanFile.hasNext()) {
			String word_Definition = scanFile.nextLine();
			String key;
			String value;
			
			int delimiterIndex = word_Definition.indexOf("\t");
			if (delimiterIndex != -1) {
				key = word_Definition.substring(0 , delimiterIndex);
				value = word_Definition.substring(delimiterIndex, word_Definition.length());
				dictionary.put(key, value);
			}
			
		}
		System.out.println(dictionary);
			
	}
	
	/**
	 * it closes the file so it does not remain open after its execution
	 */
	public void closeFile() {
		scanFile.close();
	}
	
	/**
	 * It searches for specific words in the hash map. 
	 * Giving the word, its definition, and its hash code if found.
	 */
	public void findWord() {
		String[] wordToSearch = {"plain over", "brimstone", "scot", "fare", "fain"};
		for ( int index = 0; index < wordToSearch.length; index++)
		System.out.println(wordToSearch[index] + ":" + dictionary.get(wordToSearch[index]) + "// Key: " + wordToSearch[index].hashCode());
		
	}
}