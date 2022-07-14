//package leetcode;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class LongestPalindrome {
//
//    public String longestPalindrome(String s) {
//
//        if (s.length() == 1){
//            return s;
//        }else{
//            int max = 0;
//            int length = 0;
//            Map<Character, Integer> data = new HashMap();
//            for (int i=0; i<s.length(); i++){
//                char key = s.charAt(i);
//
//                if (data.entrySet().contains(key)){
//                    length = i - data.get(key);
//                }else{
//                    data.put(key, i);
//                }
//
//                if (max < length){
//                    max = length;
//                }
//            }
//            return max;
//        }
//    }
//}
