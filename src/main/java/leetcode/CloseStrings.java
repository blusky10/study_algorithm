package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();

        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();

        int max1 = 0;
        int max2 = 0;

        for (int i=0; i<word1.length(); i++){
            char w1 = word1.charAt(i);
            Integer integer1 = word1Map.get(w1);
            if (integer1 == null) {
                buffer1.append(w1);
                integer1 = 0;
            }
            integer1++;
            word1Map.put(w1, integer1);

            if (max1 <= integer1){
                max1 = integer1;
            }

            char w2 = word2.charAt(i);
            Integer integer2 = word2Map.get(w2);

            if (integer2 == null) {
                buffer2.append(w2);
                integer2 = 0;
            }
            integer2++;
            word2Map.put(w2, integer2);
            if (max2 <= integer2){
                max2 = integer2;
            }
        }

        if (word1Map.size() != word2Map.size()) return false;

        Set<Character> characters = word1Map.keySet();
        Set<Character> characters1 = word2Map.keySet();

        if (!characters.equals(characters1)) return false;

        if (max1 != max2) return  false;


        return true;
    }
}
