package main.strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
		CountWords("This is a sentence with 7 words");
		CountWords("po op");

		CountWordsFromFile("src/projects/paragraph.txt");
	}
	private static void CountWords(String inputString) {
		System.out.println(inputString.split(" ").length + " words in the analyzed text");
	}
	private static void CountWordsFromFile(String filePath) {
		 try {
			String text = new Scanner( new File(filePath) ).useDelimiter("\\A").next();
			CountWords(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
