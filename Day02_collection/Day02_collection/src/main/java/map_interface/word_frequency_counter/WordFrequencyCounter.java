package map_interface.word_frequency_counter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
public class WordFrequencyCounter {
    public static Map<String, Integer> countFrequency(String content){
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = content.split(" ");
        for (String word : words) if (!word.isEmpty()) wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        return wordCountMap;
    }

    public static void main(String[] args) {

        StringBuilder fileData = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/map_interface/word_frequency_counter/file.text"))) {

            int character;
            while ((character = br.read()) != -1){
                char c = (char) character;
                if ((c >= 'a' && c <= 'z') || c == ' ' || (c >= '0' && c <= '9')){
                    fileData.append(c);
                } else if (c >= 'A' && c <= 'Z'){
                    c = (char)(c - 'A' + 'a');
                    fileData.append(c);
                } else fileData.append(' ');
            }

        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("File data is : "+fileData);

        Map<String, Integer> wordCount = countFrequency(fileData.toString());

        System.out.println("Word and its count frequency is : "+wordCount);

    }
}

