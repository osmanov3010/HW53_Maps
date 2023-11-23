package ait.map.word;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static boolean isAnagram(String word, String part) {
        // TODO Homework

        if (part == null || part.length() == 0) {
            return false;
        }

        Map<Character, Integer> wordLetters = new HashMap<>();
        Map<Character, Integer> partLetters = new HashMap<>();

        lettersHandler(word, wordLetters);
        lettersHandler(part, partLetters);

        Set<Map.Entry<Character, Integer>> check = partLetters.entrySet();

        for (Map.Entry<Character, Integer> entry : check) {
            if (wordLetters.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                return false;
            }
        }

        return true;
    }

    private static void lettersHandler(String word, Map<Character, Integer> map) {
        char[] lettersArray = word.toLowerCase().toCharArray();
        for (int i = 0; i < lettersArray.length; i++) {
            map.merge(lettersArray[i], 1, (v1, v2) -> v1 + v2);
        }
    }
}
