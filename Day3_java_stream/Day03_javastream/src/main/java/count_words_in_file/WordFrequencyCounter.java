package count_words_in_file;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "src/main/java/count_words_in_file/readerFile";

        // Step 1: Read file and count word frequencies
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(" Error reading file: " + e.getMessage());
            return;
        }

        // Step 2: Sort by frequency using a PriorityQueue
        PriorityQueue<Map.Entry<String, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(wordCount.entrySet());

        // Step 3: Display top 5 words
        System.out.println(" Top 5 Most Frequent Words:");
        int count = 0;
        while (!maxHeap.isEmpty() && count < 5) {
            Map.Entry<String, Integer> entry = maxHeap.poll();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            count++;
        }
    }
}
