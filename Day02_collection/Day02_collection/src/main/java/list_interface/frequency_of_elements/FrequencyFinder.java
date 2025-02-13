package list_interface.frequency_of_elements;

import java.util.*;

public class FrequencyFinder{
    public static Map<String, Integer> setFrequencyOfElement(List<String> stringArrayList){
        Map<String, Integer> stringCountMap = new HashMap<>();
        for (int i=0; i<stringArrayList.size(); i++){
            stringCountMap.put(stringArrayList.get(i), stringCountMap.getOrDefault(stringArrayList.get(i), 0) + 1);
        }
        return stringCountMap;
    }

    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));

        System.out.println("Data of list: " + stringArrayList);

        Map<String, Integer> stringCountMap = setFrequencyOfElement(stringArrayList);
        System.out.println("Frequency of elements are: "+stringCountMap);

    }
}
