package ait.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DigitsFreqAppl {
    private static Random random = new Random();
    private static Map<Character, Integer> map = new HashMap<>();
    private static final int COUNT_OF_NUMBERS = 1_000_000;

    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        // TODO Generate 1_000_000 random int positive numbers
        // and calculate digits frequency
        // 18374, 9832, 67, 3525
        // [1] -> 1
        // [2] -> 2
        // [3] -> 3
        // [4] -> 1
        // ...


        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            int number = random.nextInt(0, Integer.MAX_VALUE);
            numberHandler(number);
        }

        printNumbersFrequency();

    }

    private static void numberHandler(int number) {

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append(number);
        int length = stringBuilder.length();

        for (int i = 0; i < length; i++) {
            map.merge(stringBuilder.charAt(i), 1, (v1, v2) -> v1 + v2);
        }
    }

    private static void printNumbersFrequency() {
        Set<Map.Entry<Character, Integer>> set = map.entrySet();

        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println("[" + entry.getKey() + "] -> " + entry.getValue());
        }

    }
}
