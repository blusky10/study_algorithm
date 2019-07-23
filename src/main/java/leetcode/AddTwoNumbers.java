package leetcode;

import java.util.ArrayList;
import java.util.List;

//Add Two Numbers
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int add = 0;
        List<Integer> resultList = new ArrayList<>();
        while(true){
            int sum = l1.val + l2.val + add;
            int val = 0;

            if (sum >=10){
                val = sum % 10;
                add = 1;
            }else{
                val = sum;
                add = 0;
            }

            resultList.add(val);

            if (l1.next == null && l2.next == null){
                if (add != 0){
                    resultList.add(add);
                }
                break;
            }else if (l1.next != null && l2.next == null){
                l1 = l1.next;
                l2.val = 0;
            }else if (l1.next == null && l2.next != null){
                l1.val = 0;
                l2 = l2.next;
            }else{
                l1 = l1.next;
                l2 = l2.next;
            }

        }

        result = makeListToListNode(resultList);
        return result;
    }

    public ListNode makeListToListNode(List<Integer> list){
        int index = list.size()-1;
        ListNode listNode = new ListNode(list.get(index));

        for (int i=index-1; i>=0; i--){
            ListNode temp = new ListNode(list.get(i));
            temp.next = listNode;
            listNode = temp;
        }
        return listNode;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}