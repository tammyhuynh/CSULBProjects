/**
 * 
 */
package project8;

import java.io.*;

import java.util.*;

/**
 * @author tammyhuynh
 *
 */
public class FirstLetterMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList <String> collection = new ArrayList<String>();
		File file = new File("test1.txt");
		FileInputStream inputFile = null;
		Map <Character,Set<String>> sort = new HashMap<>();
		String path = file.getAbsolutePath();		
		//Try and catch block to find file
		try {
			inputFile = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			System.out.println("Couldnt find File");
			e.printStackTrace();
		}
		
		//Initializing scanner to read file
		Scanner reading = new Scanner(inputFile);
		
		//Creates an ArrayList for all the words in the text file
		while(reading.hasNext()) {	
			collection.add(reading.next());
		}
		
		
		//Uses the size for the array list to put each word onto the map
		for(int i = 0;i<collection.size();i++) {
			String word = collection.get(i);
			//lower case string and replacing special characters
			word = word.toLowerCase();
			word = word.replaceAll("[.,]", "");
			
			if(!sort.containsKey(word.charAt(0))) {
				sort.put(word.charAt(0), new TreeSet<>());
			}
			sort.get(word.charAt(0)).add(word);
		}
		
		//Printing for the map
		for(char key: sort.keySet()) {
			System.out.println(key +":"+sort.get(key));
		}

		//closes scanner
		reading.close();
	}
}
