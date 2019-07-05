package leetcode;

import java.util.ArrayList;
import java.util.List;

//Add Two Numbers
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i = Integer.parseInt(makeListNodeToNumber(l1).reverse().toString())
                + Integer.parseInt(makeListNodeToNumber(l2).reverse().toString());

        return makeNumberToListNode(i);
    }


    public StringBuilder makeListNodeToNumber(ListNode l){
        StringBuilder number = new StringBuilder();
        number.append(l.val);

        if (l.next != null){
            number.append(makeListNodeToNumber(l.next));
        }

        return number;
    }

    public void setListNode(ListNode listNode, StringBuilder result){
        if (listNode.next !=null){
            setListNode(listNode.next, result);
        }
        result.append(listNode.val);
    }

    public ListNode makeNumberToListNode(int n){
        String number = Integer.toString(n);

        char[] chars = number.toCharArray();
        int index = chars.length-1;
        ListNode result = new ListNode(Character.getNumericValue(chars[index]));
        for (int i=index-1; i>=0; i--){
            this.addListNode(result, Character.getNumericValue(chars[i]));
        }

        return result;
    }

    public ListNode addListNode(ListNode listNode, int nextVal){
        if (listNode.next == null){
            listNode.next = new ListNode(nextVal);
            return listNode;
        }

        return addListNode(listNode.next, nextVal);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}