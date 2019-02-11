package codewars;

import java.util.*;

/**
 * Created by Sanghyun KIM on 2019-02-08.
 */

// Valid Braces
//"(){}[]"   =>  True
//        "([{}])"   =>  True
//        "(}"       =>  False
//        "[(])"     =>  False
//        "[({})](]" =>  False
public class BraceChecker {

    public boolean isValid(String braces) {
        List<Character> open = Arrays.asList('(', '{', '[');
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        System.out.println(braces);
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<braces.length(); i++){
            char c = braces.charAt(i);

            if (open.contains(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if (pop != map.get(c)){
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) return false;

        return true;
    }
}
