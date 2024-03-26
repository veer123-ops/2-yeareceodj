package veer.com;



import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is a sample text. This text contains some words. The words may repeat.";

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Count the frequency of each word
        for (String word : words) {
            // Convert the word to lowercase to make the counting case-insensitive
            String lowercaseWord = word.toLowerCase();

            // Update the frequency in the map
            wordFrequencyMap.put(lowercaseWord, wordFrequencyMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        // Display the word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


