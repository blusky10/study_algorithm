package leetcode;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

//Given a string, find the length of the longest substring without repeating characters.
//Example 1:
//
//Input: "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        int pwwkew = solution.lengthOfLongestSubstring(" ");

        System.out.println("result : " + pwwkew);
    }

    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        Queue<Character> queue = new LinkedList<>();

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            boolean contains = queue.contains(c);
            if (!contains){
                queue.add(c);
            }else{
                int cur = queue.size();
                if (cur>=max){
                    max = cur;
                }
                while (true){
                    Character poll = queue.poll();
                    if (poll == c){
                        break;
                    }
                }
                queue.add(c);
            }
        }

        if (queue.size()>=max){
            max = queue.size();
        }

        return max;
    }
}
