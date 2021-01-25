package codewars;


//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
// pigIt('Hello world !');     // elloHay orldway !

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        // Write code here

        String[] s1 = str.split(" ");
        List<String> result = new ArrayList<>();
        for (int i=0; i<s1.length; i++){
            String word = s1[i];
            if (!Arrays.asList("?", "!").contains(word)){
                StringBuffer sb = new StringBuffer(word);
                sb.append(word.charAt(0));
                sb.append("ay");
                result.add(sb.toString().substring(1));
            }else{
                result.add(word);
            }
        }
        return result.stream().collect(Collectors.joining(" "));
    }
}
