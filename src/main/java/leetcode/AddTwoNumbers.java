package leetcode;

//Add Two Numbers
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long i = makeNumber(l1) + makeNumber(l2);
        return makeNumberToListNode(i);
    }

    public long makeNumber(ListNode l){
        ListNode node = l;
        long result = 0;
        int i=0;

        while(node != null){
            result += node.val * (Math.pow(10,i));
            i++;
            node = node.next;
        }

        return result;
    }

    public ListNode makeNumberToListNode(long n){
        String number = Double.toString(n);

        char[] chars = number.toCharArray();

        ListNode result = new ListNode(Character.getNumericValue(chars[0]));

        for (int i=1; i<chars.length; i++){
            ListNode now = new ListNode(Character.getNumericValue(chars[i]));
            now.next = result;
            result = now;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}