package day01.day04;

import java.util.Map;
import java.util.TreeMap;

public class StringStatistics {

    private static final String VOWELS = "aeiou";

    public Map<Character,Integer> vowelCounter(String word){
        Map<Character,Integer> result = new TreeMap<>();
        for(int i = 0; i<word.length(); i++){
            if(isVowel(word.charAt(i))){
                if(!result.containsKey(word.charAt(i))){
                    result.put(word.charAt(i),1);
                } else {
                    result.put(word.charAt(i),result.get(word.charAt(i))+1);
                }
            }
        }
        return result;
    }

    private boolean isVowel(char c){
        return VOWELS.indexOf(Character.toLowerCase(c)) >=0;
    }
}
